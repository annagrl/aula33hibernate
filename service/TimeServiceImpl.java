package com.aula33.hibernate.service;

import com.aula33.hibernate.model.Time;
import com.aula33.hibernate.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeServiceImpl implements TimeService {

    private final TimeRepository timeRepository;

    @Autowired
    public TimeServiceImpl (TimeRepository timeRepository){
        this.timeRepository = timeRepository;
    }


    @Override
    public void salvar(Time time) {
        this.timeRepository.save(time);
    }

    @Override
    public Optional<Time> getById(Integer id) {
        return this.timeRepository.findById(id);
    }

    @Override
    public void excluir(Integer id) {
        this.timeRepository.deleteById(id);

    }

    @Override
    public List<Time> buscarTodos() {
        return this.timeRepository.findAll();
    }

    @Override
    public void atualizar(Time time) {
        this.timeRepository.save(time);

    }
}
