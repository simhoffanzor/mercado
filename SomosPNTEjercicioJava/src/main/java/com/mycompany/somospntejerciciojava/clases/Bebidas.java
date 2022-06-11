package com.mycompany.somospntejerciciojava.clases;


public class Bebidas extends Producto{
    
    Double litros;

    public Bebidas(String nombre, Double litros, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Double getCantidad() {
        return litros;
    }

    public void setCantidad(Double litros) {
        this.litros = litros;
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
        return String.format("Nombre: %s /// Litros: %1.1f /// Precio: $%d", nombre, litros, precio);
    }
    
    
    
    
}
