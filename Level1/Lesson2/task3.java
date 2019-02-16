public class task3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxArr = arr.length;
        for (int i = 0; i<maxArr; i++){
            if (arr[i]<6)
                arr[i]=arr[i]*2;
            System.out.println(arr[i]);
        }
    }
}