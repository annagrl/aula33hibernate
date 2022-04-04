package com.aula33.hibernate.controller;


import com.aula33.hibernate.model.Time;
import com.aula33.hibernate.service.TimeService;
import com.aula33.hibernate.service.TimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeServiceImpl timeServiceImpl;

    @Autowired
    public TimeController (TimeServiceImpl timeServiceImpl) {
        this.timeServiceImpl = timeServiceImpl;
    }

    @PostMapping
    public ResponseEntity<?> salvar (@RequestBody Time time){
        timeServiceImpl.salvar(time);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById (@PathVariable Integer id){
        return ResponseEntity.ok(timeServiceImpl.getById(id).get());
    }

    @GetMapping
    public ResponseEntity<?> getAll (){
        return ResponseEntity.ok(timeServiceImpl.buscarTodos());
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteById (@PathVariable Integer id) {
        timeServiceImpl.excluir (id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> atualizar (@RequestBody Time time){
        if (time.getId() == null) {
            timeServiceImpl.salvar(time);
        } else{
            timeServiceImpl.atualizar(time);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
