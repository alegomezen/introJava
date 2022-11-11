
package javaintro;
import java.util.Scanner;

public class Bucles {

    
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un numero positivo: ");
            num= leer.nextInt();
            if (num>1000){
                System.out.println("Este programa podria tardar. Esta seguro? (s/n)");
                String confirma= leer.next();
                if (confirma.equals("s")) { 
                    break;
                }
            }
        } while (num <=0 || num > 1000);
        // TODO code application logic here
        int j, suma;
        for (int i=1;i<=num; i++){
            if (i%2!=0)
                continue;
            suma=0;
            j=1;
            while(j<=i){
                suma += j;
                j++;
            }
               System.out.println("La suma de los "+i+"numeros es: "+suma);
                   
            
        }
    } 
    
}
