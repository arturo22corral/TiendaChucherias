package com.ceep.tiendachuches.principal;

import com.ceep.tiendachuches.dominio.Tienda;
import com.ceep.tiendachuches.negocio.*;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
        var opcion = -1;
        var nombrePeli = "";
        var lectura = new Scanner(System.in);
        var nombreChuche = "TiendaChuches.txt";
        ICatalogoChuches catalogo = new CatalogoChuchesImpl();
        
        while (opcion != 0) {
            System.out.println("Elige una de las opciones: \n"
                    + "1.- Iniciar catálogo de chucherias. \n"
                    + "2.- Agregar película. \n"
                    + "3.- Listar películas. \n"
                    + "4.- Buscar película. \n"
                    + "0.- Salir \n");
            // Leemos la opción del la consola
            opcion = Integer.parseInt(lectura.nextLine());
            
            switch (opcion){
                case 1: 
                {
                    String nombreCatalogo = null;
                    catalogo.iniciarCatalogo(nombreCatalogo);
                }
                    System.out.println("Catálogo iniciado...");
                    break;

                case 2:
                    System.out.println("Introduce el nombre de la chucheria que te quieras llevar: ");
                String nombrechuche = lectura.nextLine();
                    catalogo.agregarChucheria(nombrechuche, nombrechuche);
                {
                    String chuchenueva = null;
                    System.out.println("Se ha agregado la " + chuchenueva + " al catálogo "
                            + nombrechuche);
                }
                    break;


                case 3: 
                  Object String = null;
.                   String = null catalogo
listarChuche(nombrechuche);
                    break;



                case 4: 
                    System.out.println("Introduce el nombre de la chucheria que quieres buscar: ");
                String chuchenueva = lectura.nextLine();
                    catalogo.buscarChucheria(nombrechuche, chuchenueva);
                    break;

                case 0:
                    System.out.println("Adios y hasta pronto!!! :(");
                    break;
                default: 
                    System.out.println("Opción desconocida.");
                    
            }
        }        
    }

    private static void listarPelicula(String nombrechuche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void listarChuche(String nombrechuche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class catalogo {

        public catalogo() {
        }
    }
    
}
