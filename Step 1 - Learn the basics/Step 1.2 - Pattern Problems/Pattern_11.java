/*
Input: 5

Output:

1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1

 */
class Solution {

    void printTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print((i + j) % 2 + " ");

            }
            System.out.println();
        }
    }
}