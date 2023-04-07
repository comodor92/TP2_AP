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
        
        System.out.println("Ejercicio1-a");
        int num1= 1, num2=2, num3=3;
        char direccion = 'd';
        OrdenarNum(num1,num2,num3,direccion);
        
        //Ejercicio1-b
        System.out.println("Ejercicio1-b");
        Scanner nums = new Scanner(System.in);
        Scanner direccion = new Scanner(System.in);
        System.out.println("Ingrese tres numeros separados por un espacio");
        String numeros = nums.nextLine();
        System.out.println(numeros);
    }
    
    private static void OrdenarNum(int num1,int num2,int num3,char direccion){
        int numDesordenado[]={num1,num2,num3};
        int max = 0;
        int med = 0;
        int min = 1000000;
        
        for(int num : numDesordenado){
            if(num > max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        for(int num : numDesordenado){
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
    
}
