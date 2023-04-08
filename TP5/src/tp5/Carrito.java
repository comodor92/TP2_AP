/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author jorge
 */
public class Carrito {
    private Producto prod1;
    private Producto prod2;
    private Producto prod3;
    private Producto prodList[]= new Producto[3];
    private Double total;
    private Descuento desc= new Descuento("Sin descuento",0.0);
    public Carrito(){
        
    }
    public Carrito(Producto list[]){
        this.prodList = list;
    }
    public Producto getProd1() {
        return prod1;
    }

    public void setProd1(Producto prod1) {
        this.prod1 = prod1;
    }

    public Producto getProd2() {
        return prod2;
    }

    public void setProd2(Producto prod2) {
        this.prod2 = prod2;
    }

    public Producto getProd3() {
        return prod3;
    }

    public void setProd3(Producto prod3) {
        this.prod3 = prod3;
    }

    public Descuento getDesc() {
        return desc;
    }

    public void setDesc(Descuento desc) {
        this.desc = desc;
    }

    public Double getTotal() {
        return total;
    }

    public void calcularTotal() {
        this.total = prod1.getPrecio()+prod2.getPrecio()+prod3.getPrecio();
        this.total = this.total-(this.total*desc.getDescuento());
    }
    
    public void calcularTotalLista(){
        double suma = 0;
        for(Producto prod: prodList){
            suma = suma+prod.getPrecio();
        }
        
        this.total = suma;
        this.total = this.total-(this.total*desc.getDescuento());

    }
    
}
