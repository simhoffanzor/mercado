
package com.mycompany.somospntejerciciojava.clases;


public class Perfumería extends Producto {
    
    int contenido;
    String medida;

    public Perfumería(String nombre, int contenido, String medida, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
        this.medida = medida;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
    public String getMedida() {
        return medida;
    }
    
    public void setMedida (String medida) {
        this.medida = medida;
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
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %d%s /// Precio: $%d", nombre, contenido, medida, precio);
    }
    
}
