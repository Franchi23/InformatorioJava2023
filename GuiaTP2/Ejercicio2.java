package GuiaTP2;

import java.util.Scanner;

//Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
//esa cantidad mostrando el nombre de cada amigo.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad =5;
        String N1="",N2="",N3="",N4="",N5="";
        System.out.println("");
        System.out.println("---------------------------");        
        System.out.println("         MIS AMIGOS");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("Ingrese los Nombres de 5 Amigos :");

        int i=1;
        while (i<=cantidad){
            switch (i){
                case 1:
                    N1 = sc.nextLine();
                break;
                case 2:
                    N2 = sc.nextLine();
                break;
                case 3:
                    N3 = sc.nextLine();
                break;
                case 4:
                    N4 = sc.nextLine();
                break;
                case 5:
                    N5 = sc.nextLine();
                break;
            }
            i++;
        }

System.out.println("");
System.out.println("Ahora los voy a mostrar a la inversa que fueron ingresados");
System.out.println("");

        for (int j=1;j<=cantidad;j++){
            switch (j){
                case 1:
                   System.out.println("Primer Amigo: " + N5);
                break;
                case 2:
                    System.out.println("Segundo Amigo: " + N4);
                break;
                case 3:
                    System.out.println("Tercer Amigo: " + N3);
                break;
                case 4:
                    System.out.println("Cuarto Amigo: " + N2);
                break;
                case 5:
                    System.out.println("Quinto Amigo: " + N1);
                break;
            }
        }
     System.out.println();
    }
}
