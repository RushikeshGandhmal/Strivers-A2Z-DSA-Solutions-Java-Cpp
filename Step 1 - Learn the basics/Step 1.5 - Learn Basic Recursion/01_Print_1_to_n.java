/* 
Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10 
*/

class Solution {

    public void printNos(int N) {

        if (N == 0)
            return;
        printNos(N - 1);
        System.out.print(N + " ");
    }
}