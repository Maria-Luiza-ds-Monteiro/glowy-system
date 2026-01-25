package com.mallutechnology.glowy_system.repository;

import com.mallutechnology.glowy_system.Model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

//criei uma interface, ou seja, a classe serviço ela vai usar o JPA(dependencia q chama metodo)
public interface Servico_Repository extends JpaRepository<Servico,Long>{

}
