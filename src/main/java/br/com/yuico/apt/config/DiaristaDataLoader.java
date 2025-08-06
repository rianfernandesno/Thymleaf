package br.com.yuico.apt.config;

import br.com.yuico.apt.models.entities.Diarista;
import br.com.yuico.apt.repositories.DiaristaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DiaristaDataLoader {

    private final DiaristaRepository diaristaRepository;

    public DiaristaDataLoader(DiaristaRepository diaristaRepository) {
        this.diaristaRepository = diaristaRepository;
    }

    @PostConstruct
    public void loadData() {
            Diarista d1 = new Diarista();
            d1.setNome("Maria Silva");
            d1.setTelefone("(11) 91234-5678");
            d1.setEndereco("Rua das Flores, 123");

            Diarista d2 = new Diarista();
            d2.setNome("Ana Santos");
            d2.setTelefone("(11) 92345-6789");
            d2.setEndereco("Av. Brasil, 456");

            Diarista d3 = new Diarista();
            d3.setNome("Joana Lima");
            d3.setTelefone("(11) 93456-7890");
            d3.setEndereco("Rua Verde, 789");

            Diarista d4 = new Diarista();
            d4.setNome("Paula Costa");
            d4.setTelefone("(11) 94567-8901");
            d4.setEndereco("Rua Azul, 101");

            Diarista d5 = new Diarista();
            d5.setNome("Juliana Rocha");
            d5.setTelefone("(11) 95678-9012");
            d5.setEndereco("Rua Amarela, 202");

            Diarista d6 = new Diarista();
            d6.setNome("Luciana Souza");
            d6.setTelefone("(11) 96789-0123");
            d6.setEndereco("Rua Cinza, 303");

            Diarista d7 = new Diarista();
            d7.setNome("Fernanda Reis");
            d7.setTelefone("(11) 97890-1234");
            d7.setEndereco("Av. Central, 404");

            Diarista d8 = new Diarista();
            d8.setNome("Cláudia Mendes");
            d8.setTelefone("(11) 98901-2345");
            d8.setEndereco("Rua Norte, 505");

            Diarista d9 = new Diarista();
            d9.setNome("Tatiane Alves");
            d9.setTelefone("(11) 99012-3456");
            d9.setEndereco("Rua Sul, 606");

            Diarista d10 = new Diarista();
            d10.setNome("Renata Dias");
            d10.setTelefone("(11) 90123-4567");
            d10.setEndereco("Av. Oeste, 707");

            diaristaRepository.save(d1);
            diaristaRepository.save(d2);
            diaristaRepository.save(d3);
            diaristaRepository.save(d4);
            diaristaRepository.save(d5);
            diaristaRepository.save(d6);
            diaristaRepository.save(d7);
            diaristaRepository.save(d8);
            diaristaRepository.save(d9);
            diaristaRepository.save(d10);

    }
}
