/*

Input: 5

Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*

 */

class Solution {

    void printTriangle(int n) {

        int h = 2 * n;
        int st;

        for (int i = 1; i < h; i++) {

            if (i <= n)
                st = i;
            else
                st = h - i;

            for (int j = 0; j < st; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}