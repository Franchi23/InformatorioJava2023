package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Conversióndebitcoinsadólares:EscribirunprogramaenJavaquesoliciteal usuariounacantidadenbitcoinsymuestreel
//equivalenteendólares,utilizandouna tasadecambiofija.Porejemplo,silatasadecambioesde1bitcoin=50000 dólares,
//yelusuarioingresa0.5bitcoins,elprogramadeberámostrar25000dólares.

import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double cambio = 50000;
        double bitcoins=0;

        System.out.println("");
        System.out.print("Ingrese la cantidad de BitCoins: ");
        bitcoins=sc.nextDouble();
        System.out.println("La conversion de $ " + bitcoins + " bitcoins a dolares, segun el tipo de cambio " + cambio + "  es: " + (bitcoins * cambio) + " dolares");

        System.out.println("");

    }
}
