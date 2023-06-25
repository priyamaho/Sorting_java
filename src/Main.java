public class Main {
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,3,8};
        InsertionSort obj3 = new InsertionSort();
        obj3.insertion_sort(arr);
        SelectionSort object1 = new SelectionSort();
        object1.selectionsort(arr);
        System.out.println();
        BubbleSort obj2 = new BubbleSort();
        obj2.bubblesort(arr);

    }
}