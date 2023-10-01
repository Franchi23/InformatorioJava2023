package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Contador:Se le solicita que guarde un número en un espacio de memoria e 
//incremente dicho número 20 veces sin usar asignación.¿Que operador podría usar para hacerlo?
public class Ejercicio11 {
    public static void main(String[] args) {
        int contador=5;
         System.out.println("");
        System.out.println("Valor del Contador antes del incremento: " + contador);
        contador+=20;
        System.out.println("Valor del Contador despues del incremento: " + contador);
        System.out.println("");
    }
}
