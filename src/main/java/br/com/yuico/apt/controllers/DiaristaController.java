package br.com.yuico.apt.controllers;

import br.com.yuico.apt.repositories.DiaristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {

    @Autowired
    private DiaristaRepository repository;

    @GetMapping
    public ModelAndView buscarTodos(){
        var modelAndView = new ModelAndView("listar_diarista");

        modelAndView.addObject("diaristas", repository.findAll());

        return modelAndView;

    }

    @GetMapping("/{id}")
    public ModelAndView buscarPorId(@PathVariable Long id){
        var modelandView = new ModelAndView("detalhes");


        var diarista = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Diarista com id " + id + " não encontrado"));

        modelandView.addObject("diarista", diarista);

        return modelandView;

    }

}
