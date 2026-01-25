package com.mallutechnology.glowy_system.service;

import com.mallutechnology.glowy_system.Model.Servico;
import com.mallutechnology.glowy_system.repository.Servico_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//irei salvar os serviços no BD
//o @ service di para o spring que isso é uma classe de serviços
@Service
public class ServicoService {
    //o Autowired é para instaciar o servico e repositorio sem ele se preocupar com isso
    @Autowired
    private Servico_Repository servicoRepository;
    //criei uma variavel de serviço repositorio, onde dentro dela tem os metodos de salvar no bd
    public Servico metodosdesalvar(Servico servico) {
        return servicoRepository.save(servico);
    }
    public List<Servico> listarTodosServico(){
        return servicoRepository.findAll(); //listar todos
    }
    //amanha: 25/01/26: criar um metodo de deletar e chamar ele no controller e servicoService
}