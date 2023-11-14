package com.example.plantillaInicial.services;

import com.example.plantillaInicial.models.libroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;



@Service
public class LibroService {

    @Autowired
    libroRepository libroRepository;

    public ArrayList<libroModel> getLibro(){
        return (ArrayList<libroModel>) libroRepository.findAll();
    }

    public libroModel createLibro(libroModel libro){
        return libroRepository.save(libro);
    }

    // como el metodo puede fallar al no encontrar el id se pone optional
    public Optional<libroModel> getById(Long id){
        return libroRepository.findById(id);
    }

    public ArrayList<libroModel> getByNombre(String nombre){
        return libroRepository.findAllByNombre(nombre);
    }

    public boolean deleteLibro(Long id){
        try {
            libroRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }


}
@Service
public class BibliotecaService {

    @Autowired
    bibliotecaRepository bibliotecaRepository;

    public ArrayList<bibliotecaModel> getbiblioteca(){
        return (ArrayList<bibliotecaModel>) bibliotecaRepository.findAll();
    }

    public bibliotecaModel createbiblioteca(bibliotecaModel biblioteca){
        return bibliotecaaRepository.save(biblioteca);
    }

    // como el metodo puede fallar al no encontrar el id se pone optional
    public Optional<libroModel> getById(Long id){
        return libroRepository.findById(id);
    }

    public ArrayList<libroModel> getByNombre(String nombre){
        return libroRepository.findAllByNombre(nombre);
    }

    public boolean deletebiblioteca(Long id){
        try {
            bibliotecaRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }


}
