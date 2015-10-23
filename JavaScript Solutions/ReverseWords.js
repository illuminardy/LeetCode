/***** Problem Statement for LeetCode 151 *****/
// Given an input string, reverse the string word by word.

/**
 * @param {string} str
 * @returns {string}
 */
var reverseWords = function(str) {
    
    // Validate input
    if (str !== null){
        
        // Declarations
        var wordsArr = [], resultStr = "";
        
        wordsArr = str.trim().split(" ");
        
        for (var i = wordsArr.length - 1;  i >= 0; i--){
            if (wordsArr[i] !== ""){ // Split will include " " in array
                if (resultStr === ""){
                    resultStr += wordsArr[i];
                } else {
                    resultStr += " " + wordsArr[i];
                }
            }
        }
        return resultStr;
    }
};