/* 
Input:
5
Output:
GFG GFG GFG GFG GFG 

*/

class Solution {

    void printGfg(int N) {
        if (N == 0)
            return;
        printGfg(N - 1);
        System.out.print("GFG ");
    }
}