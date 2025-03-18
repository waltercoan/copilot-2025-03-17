package br.com.kasolution.spring.repository;

import br.com.kasolution.spring.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    Estado findByNome(String nome);
}