package Java.programacionImperativa.organizacionCodigo.Ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        int n1 = 185;
        System.out.println("El numero " + n1 + " al cuadrado es: " + n1*n1);
        System.out.println("El numero " + n1 + " al cubo es: " + n1*n1*n1);

        //--------------------------------------------------------------------------
        System.out.println("");
        double potencia = Math.pow(n1, 2);
        System.out.println("El numero " + n1 + " al cuadrado es: " + potencia);

        potencia=Math.pow(n1, 3);
        System.out.println("El numero " + n1 + " al cubo es: " + potencia);
    }
}
