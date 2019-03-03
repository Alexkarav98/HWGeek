import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        //Task 1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);
        //Task2
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

    }

    private static void swap(Object[] arr, int n1, int n2) {
        System.out.println("Task1: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("The result of the replacement: "+Arrays.toString(arr));
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Task2 and the result of the conversion : "+alt);
    }
}
