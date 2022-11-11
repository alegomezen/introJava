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
public class VideoErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo con un bucle for. Si mi idea es que la variable acumulador vaya sumando los valores de "i"
        //int acumulador=0; 
        //for (int i=0;i<10;i++){
        //    acumulador=acumulador;
        //}
        //System.out.println(acumulador); 
        ///En efecto, va a arrojar un valor "correcto", que es 0. Pero no es lo que nosotros queriamos, es un error.
        //Como sabemos, lo correcto sería:
        int acumulador=0;
        for (int i=0;i<10;i++){
            acumulador=acumulador+i;
        }
        System.out.println(acumulador);
        //Llamamos a las funciones
        int resultado=suma(1541,11540);
        System.out.println(resultado);
        //Una forma
        SaludoPers("Rocky");
        //otra forma
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        SaludoPers(nombre);                
        //otra forma escribiendo directamente
        SaludoPers(leer.next());
        
        
        // TODO code application logic here
    }
    public static int suma(int a, int b){
        //Usando el ejemplo anterior, si cambiamos el tipo de dato de la suma de "int" a, por ej, "double"
        //se generan dos errores, uno en la fila 38 y otro en la 24, donde lo llamamos. 
        // double c=a+b-> hay dos soluciones: poner int, o, cuando definimos a la funcion suma, poner double. 
        int c=a+b;
        return c;
                
    }
    public static void SaludoPers(String nombre){
        System.out.println("Hola "+nombre+", como estas ?");
    }
}
