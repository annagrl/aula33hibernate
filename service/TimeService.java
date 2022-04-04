package com.aula33.hibernate.service;

import com.aula33.hibernate.model.Jogador;
import com.aula33.hibernate.model.Time;

import java.util.List;
import java.util.Optional;

public interface TimeService {

    void salvar (Time jogador);
    Optional<Time> getById (Integer id);
    void excluir (Integer id);
    List<Time> buscarTodos();
    void atualizar (Time time);
}
