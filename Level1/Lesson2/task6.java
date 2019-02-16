public class task6 {
    static boolean checkSum(int[] array) {
        int length = array.length;
        int leftSum;
        int rightSum;

        for (int i = 0; i < length - 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += array[j];
            }

            for (int k = i + 1; k < length; k++) {
                rightSum += array[k];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}

