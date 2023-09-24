package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//2. Sumadedosnúmerosbis:Selessolicitaqueguardendosnúmerosenterosylos sumen.Elresultadoguardarlo,
//mostrarloporpantallajuntoconunmensajeque indiquesisetratadeunnúmeroparoimpar.
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1=16;
        int numero2= 35;
        int resultado;

        resultado = numero1 + numero2;

        String paridad =(resultado%2 == 0)? "Par" : "Impar";

        System.out.println( "La suma de " + numero1 + " + " + numero2 + " es: " + resultado + " y es: " + paridad);
    }
        
}
