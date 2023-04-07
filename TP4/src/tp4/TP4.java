/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        String ubicacion = "C:\\Users\\User\\TP2_AP\\TP4\\Numeros.txt";
        String operacion = "suma";
        operacionEnArchivoTexto(ubicacion,operacion);
        
        //Ejercicio3
        System.out.println("Ejercicio3");
        String ubicacionEntrada = "C:\\Users\\User\\TP2_AP\\TP4\\Entrada.txt";
        String ubicacionSalida = "C:\\Users\\User\\TP2_AP\\TP4\\Salida.txt";
        //codificado/decodificado
        String cambio = "codificado";
        int salto = 1;
        Enigma(ubicacionEntrada,ubicacionSalida,cambio,salto);
        
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
            System.out.println(min+" "+med+" "+max+"\n");
        }else if(direccion == 'd'){
            System.out.println(max+" "+med+" "+min+"\n");
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
    
    //Funcion para operar en archivos de texto
    private static void operacionEnArchivoTexto(String ubicacion,String operacion){
        Path archivoNum = Paths.get(ubicacion);
        int totalSuma= 0;
        int totalMultiplicacion= 1;
        int total;
        
        try {
            for(String numString : Files.readAllLines(archivoNum)){
                String arregloNum[] = numString.split(" ");
                for(String num :arregloNum){
                    int numTemp = Integer.parseInt(num);
                    if(operacion.equals("suma")){
                        totalSuma = totalSuma + numTemp;
                    }else if(operacion.equals("multiplicacion")){
                        totalMultiplicacion= totalMultiplicacion*numTemp;
                    }
                }                 
            }
        } catch (IOException ex) {
            System.out.println("Oooooo");
        }
        total = (totalSuma-1) +totalMultiplicacion;
        System.out.println("La "+operacion+" de los numeros en el archivo es: "+total+"\n");
    }
    
    //funcion codificadora/decodificadora
    private static void Enigma(String ubicacionEntrada,String ubicacionSalida,String cambio,int salto){
        Path archivoEntrada = Paths.get(ubicacionEntrada);
        Path archivoSalida = Paths.get(ubicacionSalida);
        String codigo = "abcdefghijklmnñopqrstuvwxyz";
        String codificado="";
        
        try {
            for(String palabra:Files.readAllLines(archivoEntrada)){
                for(int x = 0;x<palabra.length();x++){
                    if(cambio.equals("codificado")){
                        codificado = codificado +codigo.charAt(codigo.indexOf(palabra.charAt(x))+ salto);
                    }else if(cambio.equals("decodificado")){
                        if(palabra.charAt(x)=='a'){
                            codificado = codificado + " ";
                        }else{
                            codificado = codificado +codigo.charAt(codigo.indexOf(palabra.charAt(x))- salto);   
                        }
                    }  
                }
            }
            Files.writeString(archivoSalida,codificado);
            System.out.println(cambio+" exitoso");
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
        
    }
}
