package com.example.plantillaInicial.models;


import jakarta.persistence.*;

//modelo de la tabla libro
@Entity
@Table(name = "libro")
public class libroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private long id;
    private String nombre;
    private String autor;

    private String biblioteca;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor;() { return autor; }

    public void setAutor;(String autor) {this.autor = autor;
    }

    public long getBiblioteca() {return biblioteca;
    }

    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }
}
public class bibliotecaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String nombre;
    private String ciudad;

    private long direccion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getciudad;() {return ciudad;;
    }

    public void setciudad;(String getciudad) {this.ciudad = ciudad ;
    }

    public long getDireccion() {return direccion;
    }

    public void setdireccion(String cantidaddireccion) {
        this.direccion = direccion;
    }
}
