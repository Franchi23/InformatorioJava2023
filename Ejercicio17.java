package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Conversióndedólaresapesos:EscribirunprogramaenJavaquesoliciteal usuariounacantidadendólaresymuestreelequivalente
//enpesos,utilizandouna tasadecambiofija.Porejemplo,silatasadecambioesde1dólar=20pesos,yel usuarioingresa
//50dólares,elprogramadeberámostrar1000pesos.

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double cambio = 741;
        double dolares=0;

        System.out.println("");
        System.out.print("Ingrese la cantidad de Dolares: ");
        dolares=sc.nextDouble();
        System.out.printf("La conversion de $ " + dolares + " dolares a pesos, segun el tipo de cambio " + cambio + "  es: %.2f %n", (dolares * cambio));

        System.out.println("");

    }
}
