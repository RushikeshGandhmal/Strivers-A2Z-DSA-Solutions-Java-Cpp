/* 

Input: N = 153
Output: "Yes"

Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes". 

*/

class Solution {
    static String armstrongNumber(int n) {

        int res = 0, prod = n;

        while (n > 0) {
            int a = n % 10;
            res += (a * a * a);
            n /= 10;
        }
        return res == prod ? "Yes" : "No";
    }
}