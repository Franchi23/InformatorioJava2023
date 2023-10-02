import java.util.Scanner;

public class EjercicioNumerosPrimosenRango {
//Todo dado un rango de numeros, contar los numeros que van desde Min a Max que son primos y 
//mostrarlos por pantalla.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min,max, conta=0, canti =0;
    System.out.println("");
    System.out.println("--------------------------------");        
    System.out.println("   NUMEROS PRIMOS DE UN RANGO   ");
    System.out.println("--------------------------------");
    System.out.println("");
    System.out.print("Ingrese el valor minimo del rango :");
    min = sc.nextInt();
    System.out.print("Ingrese el valor maximo del rango :");
    max = sc.nextInt();
    while (max <0 || max > 1000 || max < min){
        System.out.print("Debe ingresar un valor entero entre 1 y 1000 y maximo mayor a minimo");
        System.out.println("Ingrese nuevamente el valor minimo del rango :");
        min = sc.nextInt();
        System.out.print("Ingrese nuevamente el valor maximo del rango :");
        max = sc.nextInt();
    }

    System.out.println("");

    for (int i=min; i<=max; i++)
    {
        //Entra en rango de numeros
        for(int j=2;j<=i;j++)
        //recorre desde el dos hasta el mismo
        {
            //Si es divisible por si mismo nomas es primo, ya que por 1 son todos
            if (i%j == 0)
            {
                //Si el resto de la division es cero cuenta, significa que es divible por es numero
                canti++;
            }                
        }
        //Si la variable es 1 signififca que solo es divisible por si mismo.
        if (canti== 1){
            conta++;
            System.out.println("El Numero " + i + " es primo");
        }
        canti =0;
    }
    System.out.println("");
    System.out.println("En el rango que va de " + min + " a " + max + " hay " + conta + " numeros primos");
    System.out.println("");


}
}
