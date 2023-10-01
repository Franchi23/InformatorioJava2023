package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Cálculo de la velocidad final: Escribir un programa en Java que calcule la velocidad final de un 
//objeto en caída libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
//transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
//es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo transcurrido.

import java.util.Scanner;
public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double vi=0,vf =0, g=0, t=0;
    System.out.println("");
    System.out.print("Ingrese el valor de la Velocidad Incial: ");
    vi = sc.nextDouble();
    System.out.print("Ingrese el valor de la aceleracion: ");
    g = sc.nextDouble();
    System.out.print("Ingrese el valor del tiempo: ");
    t = sc.nextDouble();
    vf= vi + (g * t);
    System.out.print("La Velocidad Final del Objeto cuya Velocidad Inicial es " + vi + " y Aceleracion " + g + " y el tiempo transcurrido " + t + " es: ");
   
    System.out.printf("%.2f ", vf);
    System.out.println("");
  }  
}
