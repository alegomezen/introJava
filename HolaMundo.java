
package javaintro;

import java.util.Scanner;


public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se crea una variable Scanner que se utiliza para leer los datos del usuario. 
        Scanner leer = new Scanner(System.in);
        ///se crea una variable cadena (String) que se utiliza para leer los datos del usuario
        String nombre;
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre: ");
        ///leemos el nombre de la persona en la variable nombre 
        nombre = leer.next();
        ///Mostramos por consola el saludo personalizado
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");

    }

}
