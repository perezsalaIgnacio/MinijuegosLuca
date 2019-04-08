package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Categoria;


public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {

}
