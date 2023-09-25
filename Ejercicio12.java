package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Descontador:Se le solicita que guarde un número en un espacio de memoria y 
//discretamente dicho número 20 veces sin usar asignación.¿Queoperadorpodría usarparahacerlo?
public class Ejercicio12 {
    public static void main(String[] args) {
            int contador=55;
             System.out.println("");
            System.out.println("Valor del Contador antes del decremento: " + contador);
            contador-=20;
            System.out.println("Valor del Contador despues del decremento: " + contador);
            System.out.println("");
    }
}
