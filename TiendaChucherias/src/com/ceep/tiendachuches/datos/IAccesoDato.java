
package com.ceep.tiendachuches.datos;

import java.util.*;
import com.ceep.tiendachuches.dominio.Tienda;
import com.ceep.tiendachuches.excepciones.*;

public interface IAccesoDato {
    
    // Comprueba si el fichero existe 
    boolean existe(String nombreArchivo);
    
    // Lista todas las películas contenidas en el archivo nombreArchivo
    List<Tienda> listar(String nombreArchivo) throws LecturaDatosEx;
    
    // Escribe una nueva película en el archivo nombreArchivo
    // con el parámetro anexar podemos indicar si queremos agregar la película o
    // sobreescribir
    void escribir(Tienda pelicula, String nombreArchivo, boolean anexar) 
            throws EscrituraDatosEx;
    
    // Busca la expresión de buscar en el archivo y nos muestra un mensaje en
    // caso de que lo encuentro o no
    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    // Crea el archivo
    void crear(String nombreArchivo) throws AccesoDatosEx;
    
    // Borra el archivo
    void borrar(String nombreArchivo);
}