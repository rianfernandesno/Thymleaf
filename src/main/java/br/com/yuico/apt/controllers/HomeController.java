package br.com.yuico.apt.controllers;

import br.com.yuico.apt.models.dto.DiaristaForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/modelmap")
    public String home2(ModelMap modelMap){
        modelMap.addAttribute("nome", "Yui");

        return "home";
    }

    @GetMapping("/modelandview")
    public ModelAndView home3(){
        var modelAndView = new ModelAndView("home");

        modelAndView.addObject("nome", "Cleysson");

        return  modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView form(){
        var modelAndView = new ModelAndView("form");

        modelAndView.addObject("form", new DiaristaForm());
        return modelAndView;
    }

    @PostMapping("/form")
    public String form2(DiaristaForm form){
        System.out.println(form);

        return "redirect:/form";
    }
}
