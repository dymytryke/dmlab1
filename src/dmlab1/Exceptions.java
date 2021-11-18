package dmlab1;

import java.util.Arrays;

public class Exceptions {
    public static void isSet(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    throw new RuntimeException("This array is not a set");
            }
        }
    }

    public static void isUniverse(int[] set, int[] universe) {

        for (int ints : set) {
            if (!Arrays.toString(universe).contains(String.valueOf(ints)))
                throw new RuntimeException("Set value/values is out of Universe");
        }
    }
}