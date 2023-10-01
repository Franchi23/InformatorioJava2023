package Java.programacionImperativa.organizacionCodigo.Ejercicios;

//Conversióndelibrasesterlinasadólares:EscribirunprogramaenJavaque solicitealusuariounacantidadenlibrasesterlinas
//y muestreelequivalenteen dólares,utilizandounatasadecambiofija.Porejemplo,silatasadecambioesde1 
//libraesterlina=1.40dólares,yelusuarioingresa50librasesterlinas,elprograma deberámostrar70dólares.

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double cambio = 1.40;
        double libras=0;

        System.out.println("");
        System.out.print("Ingrese la cantidad de Libras Esterlinas: ");
        libras=sc.nextDouble();
        System.out.println("La conversion de $ " + libras + " libras a dolares, segun el tipo de cambio " + cambio + "  es: " + libras * cambio + " dolares");

        System.out.println("");


    }
}
