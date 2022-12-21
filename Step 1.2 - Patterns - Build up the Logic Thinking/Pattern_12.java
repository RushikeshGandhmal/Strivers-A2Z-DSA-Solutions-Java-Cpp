/*

Input: 5

Output:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

 */
class Solution {

    void printTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            // for intial numbers
            for (int b = 1; b <= i; b++)
                System.out.print(b + " ");

            // For spaces
            for (int j = 0; j < (n - i) * 4; j++)
                System.out.print(" ");

            // last reverse numbers
            for (int a = i; a >= 1; a--)
                System.out.print(a + " ");

            System.out.println();
        }
    }
}