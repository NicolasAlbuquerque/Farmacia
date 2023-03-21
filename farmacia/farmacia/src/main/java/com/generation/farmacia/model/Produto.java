package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_produtos")
public class Produto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank
        @Size(min = 5,max = 100,message = "O Atributo Nome é Obrigatório.")
        private String nome;
        @NotBlank
        @Size(min = 1,max = 100, message = "O atributo Marca é obrigatório.")
        private String marca;
        @NotNull(message = "O atributo Quantidade é obrigatório.")
        private Integer quantidade;
        @NotNull(message = "O Atributo é Obrigatório.")
        private Double preco;

        @ManyToOne
        @JsonIgnoreProperties("produto")
        private Categoria categoria;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public Integer getQuantidade() {
                return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
                this.quantidade = quantidade;
        }

        public Double getPreco() {
                return preco;
        }

        public void setPreco(Double preco) {
                this.preco = preco;
        }

        public Categoria getCategoria() {
                return categoria;
        }

        public void setCategoria(Categoria categoria) {
                this.categoria = categoria;
        }
}
