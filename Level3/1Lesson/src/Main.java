import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // task1
    public static void main(String[] args) {
        Integer arr [] = {1,2,3,4};
        String arr1 [] = {"A","B","C","D"};
        swap(arr,0,3);
        swap(arr1,2,1);
        //task2
        String []arrayOfStrings = {"A","B","C","D"};
        asList(arrayOfStrings);
        }
        public static void swap(Object<t>[]arr,int n1,int n2){
            System.out.println("Task1: "+ Arrays.toString(arr));
            Object sw = arr[n1];
            arr[n1]=arr[n2];
            arr[n2]=sw;
            System.out.println("The result of the replacement: "+Arrays.toString(arr)+"\n================================");
    }
        public static <T> void asList(T[]arr){
            ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        }
}
