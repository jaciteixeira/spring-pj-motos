package br.com.fiap.springpjmotos.resources;


import br.com.fiap.springpjmotos.entity.Acessorio;
import br.com.fiap.springpjmotos.repository.AcessorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/acessorio")
public class AcessorioResource {

    @Autowired
    private AcessorioRepository repo;

    @GetMapping
    public List<Acessorio> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Acessorio findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public ResponseEntity<Acessorio> save(@RequestBody Acessorio acessorio) {
        return ResponseEntity.ok( repo.save(acessorio));
    }

}
