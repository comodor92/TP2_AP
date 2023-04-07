/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1= 1, num2=2, num3=3;
        char direccion = 'd';
        int numParaOrdenar[]={num1,num2,num3};
        
        ////Ejercicio1-a
        //System.out.println("Ejercicio1-a");
        //OrdenarNum(numParaOrdenar,direccion);
        
        ////Ejercicio1-b
        //System.out.println("Ejercicio1-b");
        //OrdenarNumConsola();
        
        //Ejercicio1-c
        System.out.println("Ejercicio1-c");
        if(numParaOrdenar.length==3&&(direccion=='a'||direccion=='d')){
            OrdenarNum(numParaOrdenar,direccion);
        }else{
            OrdenarNumConsola();
        }
        
        //Ejercicio2
        System.out.println("Ejercicio2");
    }
    
    //Funcion para ordenar numeos por parametros
    private static void OrdenarNum(int[] numParaOrdenar,char direccion){
        int max = 0;
        int med = 0;
        int min = 1000000;
        
        for(int num : numParaOrdenar){
            if(num > max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        for(int num : numParaOrdenar){
            if(num!=max&&num!=min){
                med = num;
            }
        }
        
        if(direccion == 'a'){
            System.out.println(min+" "+med+" "+max);
        }else if(direccion == 'd'){
            System.out.println(max+" "+med+" "+min);
        }
        
    }
    //funcion para ordenar numeros pedidos por consola
    private static void OrdenarNumConsola(){
        Scanner nums = new Scanner(System.in);
        Scanner aod = new Scanner(System.in);
        System.out.println("Ingrese tres numeros separados por un espacio");
        String numeros = nums.nextLine();
        System.out.println("Ingrese a por ascendente o d por decendiente");
        String eleccion = aod.nextLine();
        int cont = 0;
        int numerosParaOrdenar[]=new int[3];
        for(String numeroStr:numeros.split(" ")){
            numerosParaOrdenar[cont]=Integer.parseInt(numeroStr);
            cont++;
        }
        char direccion = eleccion.charAt(0);
        OrdenarNum(numerosParaOrdenar,direccion);
    }
    
}
