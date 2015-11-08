/***** Problem Statement for LeetCode 268 *****/
// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    var fullLength = nums.length + 1;
    var expectedSum = (Math.pow(fullLength, 2) - fullLength) / 2;
    var actualSum = 0;
    
    for (var i = 0; i < nums.length; i++){
        actualSum += nums[i];
    }
    
    return expectedSum - actualSum;
};