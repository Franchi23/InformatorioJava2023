package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Conversióndeeurosadólares:EscribirunprogramaenJavaquesoliciteal usuariounacantidadeneurosymuestreelequivalente
//endólares,utilizandouna tasadecambiofija.Porejemplo,silatasadecambioesde1euro=1.20dólares,y elusuario
//ingresa100euros,elprogramadeberámostrar120dólares.

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double cambio = 1.20;
        double euros=0;

        System.out.println("");
        System.out.print("Ingrese la cantidad de Euros: ");
        euros=sc.nextDouble();
        System.out.println("La conversion de $ " + euros + " euros a dolares, segun el tipo de cambio " + cambio + "  es: " + euros * cambio + " dolares");

        System.out.println("");


    }
}
