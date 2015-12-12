/***** Problem Statement for LeetCode 120 *****/
// Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

/**
 * @param {number[][]} triangle
 * @return {number}
 */
var minimumTotal = function(triangle) {
    var sums = [];
    
    // Initialize sums array to contain all numbers in last row
    for (var i = 0; i < triangle[triangle.length-1].length; i++){
        sums.push(triangle[triangle.length-1][i]);
    }
    
    // Update sums array by choosing minimum starting from second to last row
    for (var m = triangle.length - 2; m >= 0; m--){
        for (var j = 0; j < triangle[m].length; j++){
            sums[j] = triangle[m][j] + Math.min(sums[j], sums[j+1]);
        }
    }
    
    return sums[0];
};