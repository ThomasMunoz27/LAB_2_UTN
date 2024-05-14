package Clase_09_05.Ejerc3y4;



import java.util.ArrayList;
import java.util.List;


public class Almacen {
    List<Producto> productoList;


    public Almacen(){
        this.productoList = new ArrayList<>();
    }


    public void agregarProducto(Producto producto){
        productoList.add(producto);
    }


    public void imprimirProductos(){
        for (Producto producto:
                productoList) {
            System.out.println(producto);
        }
    }
   /*
   public void imprimirProductos(List<? extends  Producto> productoList){
       for (Producto producto:
               productoList) {
           System.out.println(producto);
       }
   }


    */


}

