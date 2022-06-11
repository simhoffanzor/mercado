package com.mycompany.somospntejerciciojava.clases;

public class Producto implements Comparable<Producto>{
    
    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto p) {
        
        int estado = 0;
        
        if (this.precio > p.getPrecio()){
            estado = 1;
        }
        
        else if (this.precio < p.getPrecio()){
            estado = -1;
        }
        
        return estado;
        
    }
    
}
