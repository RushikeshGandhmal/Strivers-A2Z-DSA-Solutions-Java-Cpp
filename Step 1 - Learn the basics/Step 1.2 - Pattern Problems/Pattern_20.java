/* 

Input: 5

Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

class Solution {

    void printTriangle(int n) {

        int k = 0;

        for (int i = 1; i < n * 2; i++) {

            k = i <= n ? ++k : --k;

            for (int j = 1; j <= n * 2; j++) {

                if (j <= k || j >= n * 2 + 1 - k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}