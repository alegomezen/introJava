/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;
import java.util.Scanner;

/**
 *
 * @author agome
 */
public class FuncionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos a las funciones
        int resultado=suma(10,10);
        System.out.println(resultado);
        //Una forma
        SaludoPers("Alejandro");
        //otra forma
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        SaludoPers(nombre);                
        //otra forma escribiendo directamente
        SaludoPers(leer.next());
        
        
        
    }
    public static int suma(int a, int b){
        //Logica o sentencias
        int c=a+b;
        return c;
                
    }
    public static void SaludoPers(String nombre){
        System.out.println("Hola "+nombre+", como estas ?");
    }
}



