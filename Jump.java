/***** Problem Statement for LeetCode problem 55 *****/
// Given an array of non-negative integers, you are initially positioned at the first index of the array.
// Each element in the array represents your maximum jump length at that position.
// Determine if you are able to reach the last index.

public class Jump {
    public boolean canJump(int[] A) {
        if (A.length == 1) return true;
        
        int max = 0;
        
        for (int i = 0; i < A.length; i++){
            max = Math.max(i+A[i], max);
            if (max >= A.length -1) return true;
            if (i >= max) return false;
        }
        
        return false;
    }
}