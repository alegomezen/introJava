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
public class Arreglos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar un arreglo de una dimension
    int[] vector;
    //Crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
    vector = new int[2];
    //los dos pasos en una linea
    int[] producto = new int [3];
    
    //Declaracion y creacion de una matriz
    //tipo[][] nombreMatriz= new tipo [Filas][Columnas]
    //Declaracion e inicializacion con valores predeterminados
    int[][] matriz = {{4,8,6},{2,1,7}};
            ///Declaracion de arreglos genericos
            ///tipo [][]...[] nombreArreglo = new tipo [cardinalidad 1][cardinalidad 2]...[cardinalidad n];
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+" : ");
        Scanner leer = new Scanner(System.in);
        //int=0 porque los subindices en Java empiezan en 0.
        for (int i=0; i<vector.length;i++){
            System.out.println("v["+i+"]");
            ///acceder al valor i del vector 
            vector[i] = leer.nextInt();
            
        }
        //Multiplicamos la matriz por el vector. 
        int sum;
        //Para cada columna de la matriz
        for (int j=0;j<matriz[0].length;j++){
            sum=0;
            //recorro todo el vector y multiplico
            for (int i=0; i<vector.length;i++){
                sum+=vector[i]*matriz[i][j];
        }
        producto[j]=sum;
    }
    String aux = " ";
    
    //Mostrar vector
    System.out.println("*Vector:");
    //Bucle for "mejorado" (enhanced)
    for (int elemento : vector ){
        aux=aux+" "+elemento;
    }
    System.out.println(aux);
    //mostrar matriz
    System.out.println("\n*Matriz:");
    //para cada una de las filas de la matriz
    for (int[] fila : matriz){
        aux="";
        //para cada elemento de la fila
        for (int elemento: fila){
            aux+=""+ elemento;
        }
        System.out.println("aux");
    }
    //Mostrar resultado
    aux="";
    System.out.println("\n* Vector x Matriz: ");
    for (int elemento:producto){
        aux += " "+elemento;
    }
    System.out.println(aux);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
              
            
            
        }
    
