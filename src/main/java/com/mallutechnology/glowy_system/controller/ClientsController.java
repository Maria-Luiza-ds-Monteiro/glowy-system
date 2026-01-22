package com.mallutechnology.glowy_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//anotação, ela configura uma parte do projeto
//RestController: diz p spring e java que isso é uma classe de controle

@RestController
@RequestMapping("/API")
public class ClientsController {

    //é um metodo do tipo string e retorna um texto
    @GetMapping("/hello")
    public String hello() {
        return "Teste Hello World";
    }
}

