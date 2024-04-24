package br.com.lucasemanuel.desafiotodolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private boolean realizado;
    private int prioridade;
    
    
    
    public Todo(String nome, String descricao, boolean realizado, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public boolean isRealizado() {
        return realizado;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    
}