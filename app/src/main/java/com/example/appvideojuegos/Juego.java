package com.example.appvideojuegos;

public class Juego {
    private String titulo;
    private String descripcion;
    private String plataforma;
    private String precio;
    private int imagenResId;

    public Juego(String titulo, String descripcion, String plataforma, String precio, int imagenResId) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.plataforma = plataforma;
        this.precio = precio;
        this.imagenResId = imagenResId;
    }

    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public String getPlataforma() { return plataforma; }
    public String getPrecio() { return precio; }
    public int getImagenResId() { return imagenResId; }
}