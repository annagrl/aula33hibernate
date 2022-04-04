package com.aula33.hibernate.model;

import javax.persistence.*;

@Entity
@Table

public class Jogador {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String posicao;
    private Double peso;
    private Double altura;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="TimeId")
    private Time time;



    public Jogador() {
    }

    public Jogador(Integer id, String nome, String posicao, Double peso, Double altura) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
    }

    public Jogador(String nome, String posicao, Double peso, Double altura) {
        this.nome = nome;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
