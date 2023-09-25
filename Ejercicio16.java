package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Obtenerporcentaje:Dados dos números,uno real y el otro entero.Obtenga el porcentaje que
//indique el segundo número del primer número.

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1=0, resultado=0;
        int n2=0;

        System.out.println("");
        System.out.print("Ingrese el Numero real: ");
        n1 = sc.nextDouble();
        System.out.print("Ingrese el Numero entero: ");
        n2 = sc.nextInt();
        resultado = (n2 * 100) / n1;
        System.out.printf("El el porcentaje del segundo número del primero es:  %.2f %n", resultado);
        System.out.println("");
    }
}
