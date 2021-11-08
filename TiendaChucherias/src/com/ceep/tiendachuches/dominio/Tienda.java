package com.ceep.tiendachuches.dominio;

public class Tienda {

    private String nombre;

    public Tienda() {
    }

    public Tienda(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Chucheria{" + "nombre=" + nombre + '}';
    }

}
