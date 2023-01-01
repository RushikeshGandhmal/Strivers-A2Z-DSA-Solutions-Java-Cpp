/* 

Input: 4

Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4 

*/

class Solution {

    void printSquare(int n) {

        int k = 2 * n - 1;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {

                System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
            }
            System.out.println();
        }
    }
}