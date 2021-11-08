
package com.ceep.tiendachuches.negocio;

import com.ceep.tiendachuches.datos.*;
import com.ceep.tiendachuches.dominio.Tienda;
import com.ceep.tiendachuches.excepciones.AccesoDatosEx;
import com.ceep.tiendachuches.excepciones.EscrituraDatosEx;
import com.ceep.tiendachuches.excepciones.LecturaDatosEx;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CatalogoChuchesImpl implements ICatalogoChuches {

    private final IAccesoDatos datos;

    public CatalogoChuchesImpl() {
        //this.datos = new AccesoDatosEx();
    }

    @Override
    public void agregarChuche(String nombrePelicula, String nombreCatalogo) {

        if (this.datos.existe(nombreCatalogo)) {
            this.datos.escribir(new Chuche(nombrePelicula), nombreCatalogo, true);
        } else {
            System.out.println("Catálogo no inicilizado");
        }
        
    }

    @Override
    public void listarChuche(String nombreCatalogo) {
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            peliculas = this.datos.listar(nombreCatalogo);
            peliculas.forEach(pelicula -> {
                System.out.println(pelicula.getNombre());
            });
        } catch (LecturaDatosEx ex) {
            System.out.println("Error leyendo el catálogo");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void buscarChuche(String nombreCatalogo, String buscar) {
        System.out.println(this.datos.buscar(nombreCatalogo, buscar));
    }

    @Override
    public void iniciarCatalogo(String nombreCatalogo) {
        if (this.datos.existe(nombreCatalogo)){
            this.datos.borrar(nombreCatalogo);
            this.datos.crear(nombreCatalogo);
        } else{
            this.datos.crear(nombreCatalogo);
        }

    }

    @Override
    public void agregarPelicula(String nombrechuche, String nombrechuche0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPelicula(String nombrechuche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarPelicula(String nombrechuche, String chuchenueva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarChucheria(String nombrechuche, String nombrechuche0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

