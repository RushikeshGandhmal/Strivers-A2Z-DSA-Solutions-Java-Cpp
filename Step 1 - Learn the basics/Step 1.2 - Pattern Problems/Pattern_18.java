/* Input: 5

Output:
E
E D
E D C
E D C B
E D C B A

*/
class Solution {

    void printTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++)
                System.out.print((char) (64 + n - j) + " ");
            System.out.println();
        }
    }
}