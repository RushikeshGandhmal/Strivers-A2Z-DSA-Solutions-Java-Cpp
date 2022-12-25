/*
 Input: 5

Output:
A
AB
ABC
ABCD
ABCDE

 */

class Solution {

    void printTriangle(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}