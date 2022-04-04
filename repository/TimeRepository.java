package com.aula33.hibernate.repository;

import com.aula33.hibernate.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository <Time, Integer> {

}
