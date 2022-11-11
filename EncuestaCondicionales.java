
package javaintro;
import java.util.Scanner;

public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion= leer.nextInt();
        if (opinion>=1 && opinion<=5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados. Mejoraremos la proxima vez.");
            break;
                case 3:
                    System.out.println("Califico la pelicula como buena");
            break;
                case 4:
                    System.out.println("Califico a la pelicula como muy buena");
              break;
                case 5:
                    System.out.println("Califico a la pelicula como excelente. Seguiremos trabajando por su satisfaccion");
               break;
               
                   
                   
            } 
        } else if (opinion < 0) {
                    System.out.println("Opinion negativa de la pelicula. Lo sentimos");
                    
            
        } else if (opinion==0) {
    System.out.println("El valor "+opinion+" no es valido para la asignacion");

    } else {
    System.out.println(opinion+ "Wow! Se te fue la mano con la calificacion");
        }
    System.out.println("Hasta la proxima");
    

        
         
        // TODO code application logic here
} 
    
}
