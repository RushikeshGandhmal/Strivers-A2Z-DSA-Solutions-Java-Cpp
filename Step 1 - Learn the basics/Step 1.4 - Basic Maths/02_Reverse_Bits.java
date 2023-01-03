/*
 * 
 * Input:
 * X = 1
 * 
 * Output:
 * 2147483648
 * 
 * Explanation:
 * Binary of 1 in 32 bits representation-
 * 00000000000000000000000000000001
 * Reversing the binary form we get,
 * 10000000000000000000000000000000,
 * whose decimal value is 2147483648.
 * 
 */

// User function Template for Java

class Solution {
    static Long reversedBits(Long X) {

        long[] arr = new long[32];
        long ans = 0;

        // This loop converts number to binary in reverse order
        for (int i = 0; i < 32; i++) {

            long binary = X % 2;
            arr[i] = binary;
            X /= 2;
        }
        // Converting binary to a number
        int power = 31;
        for (int i = 0; i < 32; i++) {

            ans += arr[i] * Math.pow(2, power);
            power--;
        }
        return ans;
    }
};