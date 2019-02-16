package tools;

import exception.ArrayDataException;
import exception.ArraySizeException;

public class Converter {

    public static int strConverter(String[][] array) throws ArraySizeException, ArrayDataException {
        {
            int x = 0;

            if (4 != array.length) throw new ArraySizeException();

            for (int i = 0; i < array.length; i++) {
                if (4 !=array[i].length)throw new ArraySizeException();

                for (int k = 0; k < array.length;k++){
                    try {
                        x += Integer.parseInt(array[i][k]);
                    }
                    catch (NumberFormatException e){
                        throw new ArrayDataException(i, k);
                    }
                }
            }
            return x;
        }
    }
}
