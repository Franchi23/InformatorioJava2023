package Java.programacionImperativa.organizacionCodigo.Ejercicios;
//Promediodeedad:Guardeendiferentesespaciosdememoriadistintosvaloresde edadylosnombresdeesaspersonas,
//luegosaquesupromedioeimprimapor 
//pantallaelnombredelapersona,suedad.Porúltimoimprimirelpromediodesus edades.
public class Ejercicio14 {
    public static void main(String[] args) {
        String Nombre1="Francisco";
        double edad1 = 45;
        String Nombre2= "Santiago";
        double edad2 = 8;
        double promedio;

        promedio = ((edad1 + edad2) / 2);
        System.out.println(" ");
        System.out.println("Persona 1-Nombre: " + Nombre1 + " Edad: " + edad1);
        System.out.println("Persona 2-Nombre: " + Nombre2 + " Edad: " + edad2);
        System.out.println(" ");
        System.out.println("El promedio de edades de las dos personas es: " + promedio);
        System.out.println(" ");

    }
}
