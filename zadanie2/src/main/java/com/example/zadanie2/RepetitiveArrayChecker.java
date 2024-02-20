package com.example.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class RepetitiveArrayChecker {
    private int[] nums;
    private boolean result = false;

    public RepetitiveArrayChecker() {}

    public boolean checkIfRepetitiveElements() {
        List<Integer> numsForChecking = new ArrayList<>();
        if(nums.length==1||nums.length==0){
            return true;
        }
        for (int num : nums) {
            if (numsForChecking.contains(num)) {
                result = true;
                break;
            }
            numsForChecking.add(num);
        }
        return result;
    }

    public boolean getResult() {
        return result;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
