package GuiaTP2;

import java.util.Scanner;

//Suma de números : Realizar un programa que guarde un número en memoria y
//determine si es par o impar.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =0;
        System.out.println("");
        System.out.println("---------------------------");        
        System.out.println("      SUMA DE NUMEROS"      );
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("Ingrese un numero entero :");

        // INGRESO DEL ENTERO, SI NO ES UN ENTERO VUELVE A PEDIR
        String NN =sc.nextLine();           //Se lee la entrada como cadena
        while (!NN.matches("[0-9]+"))   //cadena permitida
        {
            while (!NN.matches("[0-9]+"))
            {
                System.out.println("Por favor ingrese un Numero entero: ");
                NN = sc.nextLine();
            }
        }

        //Convierto la entrada string en entero // esto no se dio todavia 
        N = Integer.parseInt(NN);
         System.out.println("");
        if (N%2== 0){
            System.out.println("El numero " + N + " es par");
        }else{
            System.out.println("El numero " + N + " es impar");
        }
        System.out.println("");

    }
    
}
