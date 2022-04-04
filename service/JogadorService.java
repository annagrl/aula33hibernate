package com.aula33.hibernate.service;

import com.aula33.hibernate.model.Jogador;

import java.util.List;
import java.util.Optional;

public interface JogadorService{

    void salvar (Jogador jogador);
    Optional<Jogador> getById (Integer id);
    void excluir (Integer id);
    List<Jogador> buscarTodos();
    void atualizar (Jogador jogador);
}
