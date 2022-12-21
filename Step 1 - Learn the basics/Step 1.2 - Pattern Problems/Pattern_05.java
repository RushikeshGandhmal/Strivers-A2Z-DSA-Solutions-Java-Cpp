/* 

Input: 5

Output:
* * * * *
* * * * 
* * * 
* *  
* 

*/

class Solution {

    void printTriangle(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}