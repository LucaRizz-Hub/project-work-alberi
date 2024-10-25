package com.example.sapply.dao;

import com.example.sapply.model.Albero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlberoDao extends CrudRepository<Albero, Integer> {

//Albero findByContinente(String continente);

}
