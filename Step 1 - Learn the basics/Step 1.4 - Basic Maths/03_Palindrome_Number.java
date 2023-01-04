/* 

Input: n = 55555
Output: Yes

*/

class Solution {
    public String is_palindrome(int n) {
        int a = n, rev = 0;

        while (a > 0) {

            rev = rev * 10 + a % 10;

            a /= 10;
        }
        return rev == n ? "Yes" : "No";
    }
}
