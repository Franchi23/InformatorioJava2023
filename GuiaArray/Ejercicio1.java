package GuiaArray;
//1. Escribe un programa que tome un array y cree otro array que contenga solo
//los elementos del medio, es decir, eliminando el primer y último elemento.
public class Ejercicio1 {
    public static void main(String[] args) {
    
        int []myarray= {2,4,6,8,10,12};


            System.out.println("");
            System.out.println("-----------------------------------");        
            System.out.println("  ELIMINANDO EL PRIMERO Y EL ULTIMO");
            System.out.println("-----------------------------------");
            System.out.println("");

            int []resultado = new int[myarray.length - 2];    

            for (int i=0; i<myarray.length;i++)
            {
                if (i>0 && i < myarray.length-1) {
                    resultado[i-1]= myarray[i];
                }
            }
            System.out.print("El Array Original = " );
            for (int i =0; i<myarray.length;i++)
            {
                if (i==myarray.length-1){
                    System.out.println(myarray[i]);
                }
                else{
                    System.out.print(myarray[i] + ",");
                }
            }
            System.out.println("");
            System.out.print("El Array Resultado = " );

            for (int i =0; i<resultado.length;i++)
            {
                if (i==resultado.length-1){
                    System.out.println(resultado[i]);
                }
                else{
                    System.out.print(resultado[i] + ",");
                }
            }
                        System.out.println("");
    }

}


