package com.aula33.hibernate.repository;

import com.aula33.hibernate.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository <Jogador, Integer> {


}
