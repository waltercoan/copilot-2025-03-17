package br.com.kasolution.spring.repository;

import br.com.kasolution.spring.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByNome(String nome);
    void deleteByNome(String nome);
    Cliente findByEmail(String email); // Novo método de consulta pelo email
}