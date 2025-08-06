package br.com.yuico.apt.repositories;

import br.com.yuico.apt.models.entities.Diarista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
}
