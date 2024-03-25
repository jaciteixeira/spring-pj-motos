package br.com.fiap.springpjmotos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor



public class Veiculo {

    private Long id;

    private String nome;

    private String cor;

    private String modelo;

    //15 digitos
    private String palavraDeEfeito;

    private Double preco;

    private TipoVeiculo tipo;

    private Fabricante fabricante;

    private Set<Acessorio> acessorios = new LinkedHashSet<>();

}
