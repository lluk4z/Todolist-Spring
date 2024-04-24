package br.com.lucasemanuel.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasemanuel.desafiotodolist.entity.Todo;

// <Entidade, tipo da entidade>
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
