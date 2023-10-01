package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Cálculo de la hipotenusa de un triángulo: Escribir un programa en Java que calcule la hipotenusa 
//de un triángulo rectángulo, dados los valores de los catetos. 
//Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la hipotenusa, a y b son los catetos.

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hipotenusa=0;
        double catetoA =0;
        double catetoB=0;

        System.out.println("");
        System.out.print("Ingrese el primer cateto: ");
        catetoA = sc.nextDouble();
        System.out.print("Ingrese el segundo cateto: ");
        catetoB = sc.nextDouble();
        hipotenusa = (catetoA * catetoA) + (catetoB * catetoB);
        hipotenusa= Math.sqrt(hipotenusa); 

        System.out.printf("La Hipotenusa del Triangulo cuyos catetos son %.1f y %.1f es %.2f", catetoA,catetoB, hipotenusa);
    }
}
