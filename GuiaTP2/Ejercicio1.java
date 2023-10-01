package GuiaTP2;
//1. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
//triángulo de asteriscos en la consola. Usar bucles.
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int niveles =0;
        System.out.println("");
        System.out.println("---------------------------");        
        System.out.println("  TRIANGULO DE ASTERISCOS");
        System.out.println("---------------------------");
        System.out.println("");

        System.out.print("Ingrese la cantidad de niveles del triangulo que desea armar: ");
        niveles = sc.nextInt();
        System.out.println(); 

        for (int i=1;i<=niveles; i++)
        {
            for (int j=1; j<=niveles-i; j++)
            {
                System.out.print(" ");
            }
            for (int k =0; k<2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();       
        }
        System.out.println(); 
    }
}
