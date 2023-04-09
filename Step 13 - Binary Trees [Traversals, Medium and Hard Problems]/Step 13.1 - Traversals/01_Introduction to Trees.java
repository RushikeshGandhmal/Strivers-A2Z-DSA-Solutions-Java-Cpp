// Given an integer i. Print the maximum number of nodes on level i of a binary
// tree.

// Example 1:

// Input: 5
// Output: 16

class Solution {
    static int countNodes(int i) {

        // if u see the pattern,
        // 1
        // 2
        // 4
        // 8
        // 16 so on
        // It increases exponentially

        return (int) Math.pow(2, i - 1);
    }
}