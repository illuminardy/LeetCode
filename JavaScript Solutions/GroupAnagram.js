/***** Problem Statement for LeetCode 49 *****/
// Given an array of strings, group anagrams together.

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    var result = [];
    var groups = {};
    
    for (var i = 0; i < strs.length; i++){
        var sortedStr = strs[i].split("").sort().join("");
        
        // Use the sorted string as an index into an associative array
        if (groups.hasOwnProperty(sortedStr)){
            groups[sortedStr].push(strs[i]);
        } else {
            groups[sortedStr] = [strs[i]];
        }
    }
    
    for (var obj in groups){
        result.push(groups[obj].sort());
    }
    return result;  
} 