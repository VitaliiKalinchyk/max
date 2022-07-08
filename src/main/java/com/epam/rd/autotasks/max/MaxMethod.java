package com.epam.rd.autotasks.max;

import java.util.Arrays;

public class MaxMethod {
    public static int max(int[] values) {
        int[] copyOfArray=values.clone();
        Arrays.sort(copyOfArray);
        return copyOfArray[copyOfArray.length-1];
        //throw new UnsupportedOperationException();
    }
}
