package com.ceep.tiendachuches.negocio;

public interface ICatalogoChuches {
    
    // Agrega una Película al catálogo
    void agregarChuche(String nombrePelicula, String nombreCatalogo);
    
    // Mostrar todas las películas del catálogo
    void listarChuche(String nombreCatalogo);
    
    // Busca la película "Buscar" en nuestro catálogo
    void buscarChuche(String nombreCatalogo, String buscar);
    
    // Nos inicia nuestro catálogo
    void iniciarCatalogo(String nombreCatalogo);

    public void agregarPelicula(String nombrechuche, String nombrechuche0);

    public void listarPelicula(String nombrechuche);

    public void buscarPelicula(String nombrechuche, String chuchenueva);

    public void agregarChucheria(String nombrechuche, String nombrechuche0);
}

