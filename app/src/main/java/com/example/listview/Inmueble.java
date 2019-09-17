package com.example.listview;

public class Inmueble {

    private int foto;
    private double precio;
    private String direccion;

    public Inmueble(int foto, double precio, String direccion) {
        this.foto = foto;
        this.precio = precio;
        this.direccion = direccion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
