package com.aula33.hibernate.controller;


import com.aula33.hibernate.model.Jogador;
import com.aula33.hibernate.service.JogadorService;
import com.aula33.hibernate.service.JogadorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/jogador")
public class JogadorController {
    private final JogadorServiceImpl jogadorServiceImpl;

    @Autowired
    public JogadorController (JogadorServiceImpl jogadorServiceImpl) {
        this.jogadorServiceImpl = jogadorServiceImpl;
    }

    @PostMapping
    public ResponseEntity<?> salvar (@RequestBody Jogador jogador){
        jogadorServiceImpl.salvar(jogador);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> getById (@PathVariable Integer id){
        return ResponseEntity.ok(jogadorServiceImpl.getById(id).get());
    }

    @GetMapping
    public ResponseEntity<?> getAll (){
        return ResponseEntity.ok(jogadorServiceImpl.buscarTodos());
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteById (@PathVariable Integer id) {
        jogadorServiceImpl.excluir (id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> atualizar (@RequestBody Jogador jogador){
        if (jogador.getId() == null) {
            jogadorServiceImpl.salvar(jogador);
        } else{
            jogadorServiceImpl.atualizar(jogador);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
