package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Cálculo de la fuerza centrípeta: Escribir un programa en Java que calcule la fuerza centrípeta 
//necesaria para mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
//y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
//fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio de la trayectoria.

import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fc=0,m =0, v=0, r=0;
        System.out.println("");
        System.out.print("Ingrese el valor de la masa del objeto: ");
        m = sc.nextDouble();
        System.out.print("Ingrese el valor de la velocidad angular: ");
        v = sc.nextDouble();
        System.out.print("Ingrese el valor del radio: ");
        r = sc.nextDouble();
        fc= (m*(v*v))/r;  //m * v^2 / r
        System.out.print("La fuerza centrípeta del Objeto cuya masa es " + m + ", velocidad angular " + v + " y radio " + r + " es: ");
       
        System.out.printf("%.2f ", fc);
        System.out.println("");
    }
}
