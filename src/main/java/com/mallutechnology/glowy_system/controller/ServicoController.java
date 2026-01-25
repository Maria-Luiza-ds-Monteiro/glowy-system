package com.mallutechnology.glowy_system.controller;

import com.mallutechnology.glowy_system.Model.Servico;
import com.mallutechnology.glowy_system.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//anotação, ela configura uma parte do projeto
//RestController: diz p spring e java que isso é uma classe de controle

@RestController
@RequestMapping("/API")
public class ServicoController {
    @Autowired
    private ServicoService servicoService;

    //é um metodo do tipo string e retorna um texto
    @GetMapping("/hello")
    public String hello() {
        return "Teste Hello World, deu certo?";
    }

    //esse é um metodo de http chamar o métod de salvar usuarios de serviço
    @PostMapping("/salvar")
    public ResponseEntity<Servico> adicionarservico(@RequestBody Servico servico) {
        Servico salvar = servicoService.metodosdesalvar(servico);
        return ResponseEntity.status(201).body(salvar);
    }

    @GetMapping("/listar")
    public List<Servico> listartodosservicos() {
        return servicoService.listarTodosServico();
    }
}

