public class BubbleSort {
    public static void bubblesort(int A[]){
        for(int i = 0;i<A.length;i++){
            int max_value = A[i];
            int max_index = i;
            int length =A.length -1;
            while(i<length){
                if(max_value>A[i+1]){
                    max_value = A[i];
                    max_index = i+1;
                }
                length--;
            }
            int temp = max_value;
            A[i] = A[max_index];
            A[max_index] = max_value;


        }
        System.out.println("This is bubble sort");
        for(int val : A){
            System.out.print(val+" ");
        }
    }
}
