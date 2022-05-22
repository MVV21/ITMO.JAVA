package org.lession4;

public class Random {
    public static int[] randomArray (int n) {
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int)(Math.random() * 10);
        }
        return nums;
    }
}
