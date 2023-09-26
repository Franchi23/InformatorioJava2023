package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
//Java que convierta una temperatura en grados Celsius a grados Fahrenheit. 

import java.util.Scanner;
public class Ejercicio23 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double cel=0;
   double fahr=0;

   System.out.println("");
   System.out.print("Ingrese los grados Celsius a convertir en Fahrenheit: ");
   cel=sc.nextDouble();
   fahr = (cel * 1.8) + 32;
   System.out.printf("Los %.2f grados Celsius ingresados equivalen a %.2f grados Fahrenheit", cel,fahr);
   System.out.println("");
   System.out.println("");
   System.out.println("A la Inversa");
   System.out.print("Ingrese los grados Fahrenheit a convertir en Celsius: ");
   cel=sc.nextDouble();
   fahr = (cel - 32) / 1.8;
   System.out.printf("Los %.2f grados Fahrenheit ingresados equivalen a %.2f grados Celsius", cel,fahr);
   System.out.println("");
}    
}
