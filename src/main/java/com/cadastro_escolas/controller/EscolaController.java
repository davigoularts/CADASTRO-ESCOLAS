package com.cadastro_escolas.controller;

import com.cadastro_escolas.model.Escola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cadastro_escolas.repository.EscolaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/escolas")
@CrossOrigin
public class EscolaController {

    @Autowired
    private EscolaRepository repo;

    @GetMapping
    public List<Escola> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Escola criar(@RequestBody Escola escola) {
        return repo.save(escola);
    }

    @PutMapping("/{id}")
    public Escola atualizar(@PathVariable Long id, @RequestBody Escola escola) {
        escola.setId(id);
        return repo.save(escola);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repo.deleteById(id);
    }
}