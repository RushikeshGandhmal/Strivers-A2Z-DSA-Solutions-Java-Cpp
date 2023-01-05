
/* 

Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number 

*/

class Solution {

    public static boolean isPrime(int N) {

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}