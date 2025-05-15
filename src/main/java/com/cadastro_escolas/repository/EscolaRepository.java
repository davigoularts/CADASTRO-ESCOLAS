package com.cadastro_escolas.repository;

import com.cadastro_escolas.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository<Escola, Long> {
}