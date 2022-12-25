/* 
 Input: 5

Output:
ABCDE
ABCD
ABC
AB
A

 */

class Solution {

    void printTriangle(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}