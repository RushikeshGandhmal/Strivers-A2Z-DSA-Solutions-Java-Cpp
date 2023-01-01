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

            // Calclulate the space by total lenght(n*2) - starts on that line(i*2)
            int a = (n * 2) - (i * 2);
            for (int j = 0; j < a; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }

        // For lower half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");

            int a = (n * 2) - (i * 2);
            for (int j = 0; j < a; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}