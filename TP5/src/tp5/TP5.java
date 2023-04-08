/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 *
 * @author jorge
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto prod1 = new Producto("Arroz",001,200.0);
        Producto prod2 = new Producto("Pan",002,450.0);
        Producto prod3 = new Producto("Leche",003,100.0);
        Producto prod4 = new Producto("Dulce",004,100.0);
        
        Descuento desc1 = new Descuento("Normal",0.2);
        Descuento desc2 = new Descuento("Super",0.5);

        
        Carrito carrito1 = new Carrito();
        carrito1.setProd1(prod1);
        carrito1.setProd2(prod4);
        carrito1.setProd3(prod1);
        carrito1.setDesc(desc2);
        carrito1.calcularTotal();
        
        
        System.out.println(carrito1.getTotal());
        
        LeerListaDeCompras();
        
    }
    
    public static void LeerListaDeCompras(){
        Path ldc = Paths.get("C:\\Users\\jorge\\TP2_AP\\TP5\\Lista de compras.txt");
        Producto lista[] = new Producto[3];
        int index = 0;
        try {
            for(String linea : Files.readAllLines(ldc)){
                String item[] = linea.split(" ");
                Producto prod = new Producto(item);
                lista[index] = prod;
                index++;
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
        
        Carrito carritoLista = new Carrito(lista);
        carritoLista.calcularTotalLista();
        System.out.println(carritoLista.getTotal());
    }
    
}
