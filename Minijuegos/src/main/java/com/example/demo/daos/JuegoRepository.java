package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Juego;


public interface JuegoRepository extends CrudRepository<Juego,Integer> {

}
