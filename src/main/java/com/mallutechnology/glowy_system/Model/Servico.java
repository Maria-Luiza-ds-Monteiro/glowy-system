package com.mallutechnology.glowy_system.Model;

import com.mallutechnology.glowy_system.Model.Enums.Categoria;
import com.mallutechnology.glowy_system.Model.Enums.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Servico {
    //@: esse é o campo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//biblioteca que gera id
    private Long id;
    private String nome;

    private Categoria categoria;

    private double preco;
    private double custo;
    private double lucro;
    private double margem;
    private double tempo;
    private Status status;
    //ações vai ficar no front

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
