/***** Problem Statement for LeetCode 28 *****/
// Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class Haystack {
    public int strStr(String haystack, String needle) {
        
        // Validate input
        if (haystack == null || needle == null) return -1;
        
        // Trim the input
        haystack = haystack.trim();
        needle = needle.trim();
        
        // Check for empty string
        if (haystack == "" || needle == "") return -1;
        
        return haystack.indexOf(needle);
    }
}