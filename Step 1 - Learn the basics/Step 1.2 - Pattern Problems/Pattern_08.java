/*
Input: 5

Output:

*********
 *******
  *****
   ***
    *
 */

class Solution {

    void printTriangle(int n) {

        for (int i = n - 1; i >= 0; i--) {

            int total_no_of_stars = 2 * i + 1;
            int total_spaces = n + i - total_no_of_stars;

            // for spaces
            for (int j = 0; j < total_spaces; j++)
                System.out.print(" ");

            // for stars
            for (int j = 0; j < total_no_of_stars; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}