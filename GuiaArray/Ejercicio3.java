package GuiaArray;
//3. Dado un array, escribe un programa que tome el primer y el segundo mejor
//valor y lo devuelva en un nuevo arreglo.
public class Ejercicio3 {
    public static void main(String[] args) {
        int max=0, max2=0;
        int arr[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int res[] = new int[2];

        System.out.println("");
        System.out.println("-----------------------------------");        
        System.out.println("        PRIMER Y SEGUNDO VALOR     ");
        System.out.println("-----------------------------------");
        System.out.println("");

        System.out.println("El Arreglo : ");
        for(int i=0;i<arr.length;i++){
            
                System.out.print(arr[i] + " ");
        }
        max=0;
        max2=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
                res[0]= max;
            }
        }

        for(int i=0;i<arr.length;i++){
            if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
                res[1]= max2;
            }
        }
        
        System.out.println("");
        System.out.println("Los dos valores maximos ");
        for(int i=0;i<res.length;i++){
            
                System.out.print(res[i] + " ");
        }
        System.out.println("");

    }
}
