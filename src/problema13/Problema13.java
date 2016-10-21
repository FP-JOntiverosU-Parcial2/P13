/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema13;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arr = new int[30];  //sera de 30
        int p;
        arr=llenarArr(arr);   //se llena el arreglo
        p=promedioArr(arr);
        sobrePromedio(arr,p);
        mensajeSalida();
        
    }
    
    public static int[] llenarArr(int[] arr){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Introduce un numero para saber el promedio de 30 numeros:  "+ (i+1) +": ");
           arr[i]=entrada.nextInt();
//            
        }
    return arr;
    }
    
    public static int promedioArr(int[] arr){
        int sumat=0,total=0;              //se hace la operacion donde sumaran todos los numeros introducidos
        for (int i=0; i<arr.length; i++){  // y despues se dividiran entre el total de numeros introducidos
            sumat=arr[i]+sumat;
            total++;
        }
        System.out.println("El promedio es: "+(sumat/total));
        return (sumat/total);
    }
    public static void sobrePromedio(int[] arr,int p){   
        int may=0;                               
        for(int i=0;i<arr.length;i++){  
            if(arr[i]>p){ //si los numeros introducidos son mayores al promedio
                may++;    //se agregara 1 may
            }
        }
        System.out.println("La cantidad de numeros encima del promedio es: "+may); 
        System.out.println("La cantidad de numeros debajo del promedio es: "+(arr.length-may));  //se resta para mostrar los restantes
    }
    
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); // se agradece
        System.exit(0);
    }
   
}
