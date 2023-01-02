/* 

Input:
N = 12

Output:
2

Explanation:
1, 2 both divide 12 evenly 

*/

class Solution {
    static int evenlyDivides(int N) {

        int n = N, count = 0;

        while (n > 0) {

            int l = n % 10;
            if (l != 0 && N % l == 0)
                count++;
            n /= 10;
        }
        return count;
    }
}