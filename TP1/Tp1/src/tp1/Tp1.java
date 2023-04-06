/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

/**
 *
 * @author User
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroInicial = 4;
        int numeroFinal = 14;
        boolean pares = true;
        int comparar = numeroInicial;
        
        System.out.println("Ciclo while");
        
        while(comparar <= numeroFinal){
            if(pares){
                if(comparar%2==0){
                    System.out.println(comparar);
                }
            }else{
                if(comparar%2!=0){
                    System.out.println(comparar);
                }
            }
            comparar ++;
        }
        
        System.out.println("Ciclo for");
        
        for(int x= numeroFinal;x>=numeroInicial;x--){
            if(x%2==0){
                System.out.println(x);
            }
        }
        
        System.out.println("Clacificacion de ingresos:");
        
        float ingresosMensuales = 100000;
        int vehiculos = 1;
        int inmuebles = 1;
        
        boolean propLujosas = false;
        boolean altosIngresos = ingresosMensuales >= 489083;
        boolean multiplesVehiculos = vehiculos >= 3;
        boolean multiplesPropiedades = inmuebles >= 3;
        
        if(propLujosas||altosIngresos||multiplesVehiculos||multiplesPropiedades){
            System.out.println("Esta persona pertenece al segmento de ingresos altos.");
        }else{
            System.out.println("Esta persona no pertenece al segmento de ingresos altos.");
        }
    }
    
}
