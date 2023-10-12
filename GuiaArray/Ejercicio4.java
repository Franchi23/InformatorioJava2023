package GuiaArray;

import java.util.Arrays;

//4. Escribe un programa que tome un arreglo de enteros y cree un arreglo con
//elementos únicos.
public class Ejercicio4 {
    public static void main(String[] args) {
        int m=0;
        int arr[] = {1, 1, 2, 2, 3, 4, 5};

        System.out.println("");
        System.out.println("-----------------------------------");        
        System.out.println("        ELEMENTOS UNICOS           ");
        System.out.println("-----------------------------------");
        System.out.println("");
        
        m=0;
        //Obtengo la cantidad de repetidos, eso menos el tamaño del arreglo
        //tengo el tamaño del nuevo arreglo
        for (int i=0; i<arr.length; i++){   
            for(int j =i+1; j<arr.length; j++){
                if (arr[j] == arr[i] && i!=j)
                {
                    m+=1;
                }
            }
        }

        int c = arr.length;      
        int d =c-m;
        
        Arrays.sort(arr);   //ordeno el arreglo por las dudas. Para el ejemplo no hace falta

        int[] res = new int[d];  //establezco el tamaño del array resultado
        int j = 0;  
        for (int i=0; i<arr.length -1; i++){
            if (arr[i] != arr[i+1]){
                res[j++] = arr[i];  
            }  
         }  

         res[j++] = arr[c-1];           //copio la ultima posicion del original al resultado
        
            System.out.print("El Arreglo Original ordenado por el metodo Array.sort: ");
            for(int i=0;i<arr.length;i++){
                
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.print("El Arreglo Resultado : ");
            for(int i=0;i<res.length;i++){
                
                    System.out.print(res[i] + " ");
            }
    }
}
