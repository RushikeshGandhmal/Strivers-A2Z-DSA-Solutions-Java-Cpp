/* 

Input: 4

Output:

   A
  ABA
 ABCBA
ABCDCBA

*/
class Solution {

    void printTriangle(int n) {

        for (int i = 0; i < n; i++) {

            int st = 2 * i + 1, sp = n - i - 1;

            // Initial spaces
            for (int j = 0; j < sp; j++)
                System.out.print(" ");

            int rev = 2;
            for (int j = 0; j < st; j++) {
                if (j <= i)
                    System.out.print((char) (65 + j));
                else {
                    System.out.print((char) (65 + j - rev));
                    rev += 2;
                }
            }
            System.out.println();
        }
    }
}