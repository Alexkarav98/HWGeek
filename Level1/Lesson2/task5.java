public class task5 {
    public static void main(String[] args) {
        int []arr={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxarr;
        int minarr;
        minarr = maxarr = arr[0];
        for (int i=0;i<arr.length;i++){
         if (arr[i]<minarr) minarr=arr[i];
         if (arr[i]>maxarr) maxarr=arr[i];
        }
        System.out.println("min и max: " +minarr + "," +maxarr);
    }
}
