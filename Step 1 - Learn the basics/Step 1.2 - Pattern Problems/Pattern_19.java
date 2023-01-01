/* 

Input: 5

Output:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

class Solution {

    void printTriangle(int n) {

        // For upper half
        for (int i = n; i > 0; i--) {

            // First stars
            for (int j = 0; j < i; j++)
                System.out.print("*");

            // Calclulate the space by total lenght(n) - starts on that line(i)
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }

        // For lower half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");

            for (int j = 0; j < n - i; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}