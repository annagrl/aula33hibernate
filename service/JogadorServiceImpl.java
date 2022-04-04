package com.aula33.hibernate.service;

import com.aula33.hibernate.model.Jogador;
import com.aula33.hibernate.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorServiceImpl implements JogadorService {

    private final JogadorRepository jogadorRepository;

    @Autowired
    public JogadorServiceImpl (JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }


    @Override
    public void salvar(Jogador jogador) {
        this.jogadorRepository.save(jogador);

    }

    @Override
    public Optional<Jogador> getById(Integer id) {
        return this.jogadorRepository.findById(id);
    }

    @Override
    public void excluir(Integer id) {
        this.jogadorRepository.deleteById(id);

    }

    @Override
    public List<Jogador> buscarTodos() {
        return this.jogadorRepository.findAll();
    }

    @Override
    public void atualizar(Jogador jogador) {
        this.jogadorRepository.save(jogador);

    }
}
