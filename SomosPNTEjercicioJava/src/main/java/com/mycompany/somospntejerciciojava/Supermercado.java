package com.mycompany.somospntejerciciojava;

import com.mycompany.somospntejerciciojava.clases.Bebidas;
import com.mycompany.somospntejerciciojava.clases.Frutas;
import com.mycompany.somospntejerciciojava.clases.Perfumería;
import com.mycompany.somospntejerciciojava.clases.Producto;
import java.util.ArrayList;



public class Supermercado{
    
    //Creo la lista de productos
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public static void main(String[] args) {
       
        //Creo los objetos/productos que debe tener mi programa
        Producto cocaZero = new Bebidas("Coca-Cola Zero", 1.5, 20);
        Producto coca = new Bebidas("Coca-Cola", 1.5, 18);
        Producto shampooSedal = new Perfumería("Shampoo Sedal", 500, "ml", 19);
        Producto frutillas = new Frutas("Frutillas", 64, "kilo");
        
        //Agrego los objetos/productos a la lista de productos previamente creada
        productos.add(cocaZero);
        productos.add(coca);
        productos.add(shampooSedal);
        productos.add(frutillas);
        
        
        for (Producto item : productos){
            System.out.println(item);
        }
        
        System.out.println("=============================");
        
        //Buscando el producto más caro
        Producto productoMasCaro = productos.get(1);
        
        for (int index = 0; index < productos.size(); index++){
            
            if (productos.get(index).compareTo(productoMasCaro) == 1){
                productoMasCaro = productos.get(index);
            }
  
        }
        
        //Buscando el producto más barato
        Producto productoMasBarato = productos.get(1);
        
        for (int index = 0; index < productos.size(); index++){
            
            if (productoMasBarato.compareTo(productos.get(index)) == 1){
                productoMasBarato = productos.get(index);
            }
  
        }

       System.out.println("Producto más caro: " + productoMasCaro.getNombre());
       System.out.println("Producto más barato: " + productoMasBarato.getNombre());
        
        
    }

}
