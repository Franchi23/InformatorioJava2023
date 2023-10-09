package GuiaArray;
//2. Dado un array en 2D calcula la suma de los elementos en diagonal
public class Ejercicio2 {
    public static void main(String[] args) {
        //{1,2,3},
        //{4,5,6},
        //{7,8,9}

        int izq=0, der=0;
        //int arr[][] = new int[3][3];
        int arr[][] = {{1,2,5},{4,5,6},{7,8,5}};

        System.out.println("");
        System.out.println("-----------------------------------");        
        System.out.println("        SUMA DE LAS DIAGONALES     ");
        System.out.println("-----------------------------------");
        System.out.println("");

        //Muesto el arreglo
        System.out.println("La Matriz ");
        for(int i=0;i<arr.length;i++){
             for (int j=0; j< arr[0].length; j++)
             {
                System.out.print(arr[i][j] + " ");
             }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j< arr[0].length; j++)
            {
                if (i==j){
                    izq += arr[i][j];
                }
                if(i+j == arr.length-1){
                    der += arr[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal Principal es : " + izq);
        System.out.println("La suma de la diagonal Secundaria es : " + der);
        System.out.println();
    }
}
