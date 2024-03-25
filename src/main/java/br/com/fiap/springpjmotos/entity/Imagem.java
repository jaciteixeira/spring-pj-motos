package br.com.fiap.springpjmotos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Imagem {

    private Long id;

    private String uri;

    private Veiculo veiculo;

    private Boolean principal;
}
