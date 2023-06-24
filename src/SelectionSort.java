public class SelectionSort {
    public static void selectionsort(int A[]){
        for(int i = 0;i<A.length;i++){
            int min_val =A[i];
            int min_index = i;
            for(int j =i+1;j<A.length;j++){
                if(min_val>A[j]){
                    min_val = A[j];
                    min_index = j;
                }
            }
            int temp = A[i];
            A[i] =min_val;
            A[min_index] = temp;
        }
        System.out.println("This is Selection sort");
        for(int val : A) {
            System.out.print(val+" ");
        }
        /* or
        for(int j = 0;j<A.length;j++){
            System.out.print(A[j]+" ");
        }*/
    }
}
