package com.example.plantillaInicial.repositories;

import com.example.plantillaInicial.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface libroRepository extends CrudRepository<libroModel,Long> {

    public abstract ArrayList<libroModel> findAllByNombre(String nombre);

}
@Repository
public interface bibliotecaRepository extends CrudRepository<bibliotecaModel,Long> {

    public abstract ArrayList<bibliotecaModel> findAllByNombre(String nombre);

}
