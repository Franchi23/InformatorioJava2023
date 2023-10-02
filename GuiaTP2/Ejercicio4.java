package GuiaTP2;
//De que se trata esto? : Realizar un programa que guarde un número en memoria y
//determine si es positivo, negativo o cero.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    int n=0;
    System.out.println("");
    System.out.println("----------------------------");        
    System.out.println(" POSITIVO - NEGATIVO - CERO ");
    System.out.println("----------------------------");
    System.out.println("");
    System.out.print("Ingrese un numero :");
    n = sc.nextInt();

    if (n > 0)
    {
        System.out.println("El Numero " + n + " es mayor a cero ");
    }
    else
    {
        if (n==0)
        {
            System.out.println("El Numero " + n + " es igual a cero ");
        }
        else
        {
            System.out.println("El Numero " + n + " es menor a cero ");
        }
    }
    }
    
}


