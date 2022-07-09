package com.epam.rd.autotasks.max;

import java.util.Arrays;

public class MaxMethod {
    public static int max(int[] values) {
        int max=values[0];
        for (int value:values) {
            if (max<value)
                max=value;
        }
        return max;
        /*int[] copyOfArray=values.clone();
        Arrays.sort(copyOfArray);
        return copyOfArray[copyOfArray.length-1];*/
    }
}
