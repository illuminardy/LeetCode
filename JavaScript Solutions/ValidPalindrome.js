/***** Problem Statement for LeetCode 125 *****/
// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    if (s === null) return true;
    if (s.trim() === "") return true; 
    
    var filteredStr = s.replace(/\W/g, "").toLowerCase();
    
    return (filteredStr === filteredStr.split("").reverse().join(""));
};