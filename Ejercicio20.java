package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Conversióndepesosaeuros:EscribirunprogramaenJavaquesolicitealusuario unacantidadenpesosymuestreelequivalente
//eneuros,utilizandounatasade cambiofija.Porejemplo,silatasadecambioesde1euro=20pesos,yelusuario ingresa
//5000pesos,elprogramadeberámostrar250euros.

import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double cambio = 20;
        double pesos=0;

        System.out.println("");
        System.out.print("Ingrese la cantidad de Pesos: ");
        pesos=sc.nextDouble();
        System.out.println("La conversion de $ " + pesos + " pesos a euros, segun el tipo de cambio " + cambio + "  es: " + (pesos / cambio) + " euros");

        System.out.println("");


    }
}
