/***** Problem Statement for LeetCode 1 *****/
// Given an array of integers, find two numbers such that they add up to a specific target number.

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var result = [];
    var map = {};
    
    for (var i = 0; i < nums.length; i++){
        if (map.hasOwnProperty(target - nums[i])){
            result.push(map[target - nums[i]]);
            result.push(i+1);
        } else {
            map[nums[i]] = i+1;
        }
    }
    
    return result;
};