/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author User
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio 1-a:");
        String palabra = "Una palabra.";
        char buscar = 'a';
        int contador = 0;
        
        for(int x=0;x<palabra.length();x++){
            if(palabra.charAt(x)==buscar){
                contador++;
            }
        }
        
        System.out.println("La letra "+buscar+" aparece "+contador+" veces en "+palabra);
        
        System.out.println("Ejercicio 1-b:");
        int num1 = 1;
        int num2 = 4;
        int num3 = 3;
        int numDesordenado[]={num1,num2,num3};
        boolean ascendente = true;
        int max=0;
        int med=0;
        int min = 1000000;
        int numOrdenados[] = new int[3];
        
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
        
        if(ascendente){
            numOrdenados[0]=min;
            numOrdenados[1]=med;
            numOrdenados[2]=max;
        }else{
            numOrdenados[0]=max;
            numOrdenados[1]=med;
            numOrdenados[2]=min;
        }
        for(int num : numOrdenados){
            System.out.println(num);
        }
        
        System.out.println("Ejercicio 1-c:");
        int numeros[] = {4,8,15,6};
        int minimo = 5;
        int suma = 0;
        
        for(int num:numeros){
            if(num>minimo){
                suma = suma+num;
            }
        }
        
        System.out.println("La suma de los numeros mayores de "+minimo+" es: "+suma);
        
        System.out.println("Ejercicio 2:");
        String codigo = "abcdefghijklmnñopqrstuvwxyz";
        String sentencia = "para codificar";
        String codificado="";
        int salto = 1;
        
        for(int x = 0;x<sentencia.length();x++){
            codificado = codificado +codigo.charAt(codigo.indexOf(sentencia.charAt(x))+ salto);
        }
        
        System.out.println(codificado);

    }
    
}
