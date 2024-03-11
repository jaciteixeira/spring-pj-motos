package br.com.fiap.springpjmotos.resources;


import br.com.fiap.springpjmotos.entity.TipoVeiculo;
import br.com.fiap.springpjmotos.repository.TipoVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tipo-de-veiculo")
public class TipoVeiculoResource {

    @Autowired
    private TipoVeiculoRepository repo;

    @GetMapping
    public List<TipoVeiculo> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public TipoVeiculo findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public TipoVeiculo save(@RequestBody TipoVeiculo tipo) {
        return repo.save(tipo);
    }

}
