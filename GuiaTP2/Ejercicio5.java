package GuiaTP2;
//La suma de los primeros: Realizar un programa que calcule la suma de los
//primeros N números naturales, donde N es un número entero guardado en memoria.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=0;
    int suma=0;
    System.out.println("");
    System.out.println("----------------------------");        
    System.out.println(" SUMA DE LOS N PRIMEROS ");
    System.out.println("----------------------------");
    System.out.println("");
    System.out.print("Ingrese un numero :");
    n = sc.nextInt();

    for (int i =1; i<=n; i++){
        suma+=i;
    }
        System.out.print("La suma de los " + n );
        System.out.printf(" primeros numeros es igual a  %d:", suma);
    }    
}
