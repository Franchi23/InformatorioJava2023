package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Cálculo de la media aritmética: Escribir un programa en Java que calcule la media aritmética de un 
//conjunto de números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
//los números y k es el número total de elementos. Utilicen variables y constantes según corresponda.

import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int cantidad =4;
        double n1,n2,n3,n4;
        double media=0;
        System.out.println("");
        System.out.print("Ingrese el primer valor: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el Segundo valor: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el Tercer valor: ");
        n3 = sc.nextInt();
        System.out.print("Ingrese el Valor valor: ");
        n4 = sc.nextInt();
        media = (n1+n2+n3+n4)/cantidad;
        System.out.print("La media aritmetica de los valores " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
        System.out.printf(" es : %.2f", media);
        System.out.println("");
        System.out.println("");
        System.out.println("OTRA FORMA");
        System.out.println("");
        System.out.println("");

        int canti=0;
        media =0;
        System.out.print("Ingrese la cantidad de valores a ingresar: ");
        canti = sc.nextInt();

        int i = 1;
        do {
            System.out.print("Ingrese un valor: ");
            media+= sc.nextDouble();
            i++;
        } while (i <= canti);

        media = media/canti;
        System.out.printf("La media aritmetica de los valores ingresados es: %.2f", media);
        System.out.println("");
    }
}
