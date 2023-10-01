package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Cálculodedivisibilidad:Selesolicitaqueguardendosnúmerosenterosylos sumen,determinesielprimernúmero
//esdivisibleporelsegundonúmeroymuestre elresultado.
public class Ejercicio4 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 2;

        String divisible =((n1+n2)%2 == 0)? "Es Divisible" : "No es Divisible";

        System.out.println("El resultado de Sumar " + n1 + " + " + n2 +" es: " + (n1+n2));
        System.out.println(n1 + " " + divisible +" por " + n2);
        
    }
}
