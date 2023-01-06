/* 

Input: N = 3
Output: 1 2

Explanation: The first factorial number is 
1 which is less than equal to N. The second 
number is 2 which is less than equal to N,
but the third factorial number is 6 which 
is greater than N. So we print only 1 and 2. 

*/

import java.util.ArrayList;

class Solution {
    static ArrayList<Long> factorialNumbers(long N) {

        ArrayList<Long> arr = new ArrayList<>();
        long prev = 1, n = 1;

        while (prev * n <= N) {

            prev = prev * n;
            arr.add(prev);
            n++;
        }
        return arr;
    }
}