package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Conversiónakilogramos:Guarde en un espacio de memoria sus libras y luego,en otro espacio de memoria realice
//la conversión de esas libras a kilogramos.Utilice una constante de los valores que no van a cambiar en 
//esta conversión.Muestre el resultado por pantalla
public class Ejercicio15 {
    public static void main(String[] args) {
        final double libras = 190;
        double Kilo = 2.2046;
        double conversion=0;

        System.out.println("");
        System.out.println("El peso en libras es: " + libras);
        conversion = libras / Kilo;
        
        System.out.printf("El peso expresado en Kilogramos es: %.2f %n",conversion);
        System.out.println("");

    }
}
