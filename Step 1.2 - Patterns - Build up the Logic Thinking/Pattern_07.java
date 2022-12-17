/* 

Input: 5

Output:
    *
   ***  
  *****
 *******
********* 

*/

class Solution {

    void printTriangle(int n) {

        for (int i = 0; i < n; i++) {

            int total_no_of_starts = 2 * i + 1;
            int no_of_spaces = n + i - total_no_of_starts;

            // For inital spaces
            for (int j = 0; j < no_of_spaces; j++)
                System.out.print(" ");

            for (int j = 0; j < total_no_of_starts; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}