package com.example.plantillaInicial.controllers;

import com.example.plantillaInicial.models.bibliotecaModel;
import com.example.plantillaInicial.models.libroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.plantillaInicial.services.LibroService;
import com.example.plantillaInicial.services.BibliotecaService;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/Libro")
public class libroController {

    @Autowired
    libroService LibroService;

    @GetMapping()
    public ArrayList<LibroModel> getlibros(){
        return libroService.getlibros();
    }

    @PostMapping
    public libroModel createlibro(@RequestBody libroModel libro){
        return  libroService.createlibro(libro);
    }

    @GetMapping(path = "/{id}")
    public Optional<libroModel> getById(@PathVariable("id") Long id){
        return  this.libroService.getById(id);
    }

    @GetMapping("/consulta/{nombre}")
    public ArrayList<libroModel> getBynombre(@PathVariable("nombre") String nombre){
        return this.libroService.getBynombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public  String deletelibro(@PathVariable("id") Long id){

        boolean confirmacion = this.libroService.deletelibro(id);

        if (confirmacion){
            return "Se elinino el libro con id " + id;
        }else{
            return "No se puedo eliminar el libro con el id " +id;
        }

    }

}

@RestController
@RequestMapping("/biblioteca")
public class bibliotecaController {

    @Autowired
     bibliotecaService bibliotecaService;

    @GetMapping()
    public ArrayList<bibliotecaModel> getlibibliotecas(){
        return bibliotecaService.getbiblioteca();
    }

    @PostMapping
    public bibliotecaModel createbiblioteca(@RequestBody bibliotecaModel biblioteca){
        return  bibliotecaService.createbiblioteca(biblioteca);
    }

    @GetMapping(path = "/{id}")
    public Optional<bibliotecaModel> getById(@PathVariable("id") Long id){
        return  this.bibliotecaService.getById(id);
    }

    @GetMapping("/consulta/{nombre}")
    public ArrayList<bibliotecaModel> getBynombre(@PathVariable("nombre") String nombre){
        return this.bibliotecaService.getBynombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public  String deletebiblioteca(@PathVariable("id") Long id){

        boolean confirmacion = this.bibliotecaService.deletebiblioteca(id);

        if (confirmacion){
            return "Se elinino la biblioteca con id " + id;
        }else{
            return "No se puedo eliminar la biblioteca con el id " +id;
        }

    }

}

