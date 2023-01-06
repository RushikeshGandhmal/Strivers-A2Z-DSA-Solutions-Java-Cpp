/* 
Input:
N=5

Output:
225

Explanation:
13+23+33+43+53=225 
*/

class Solution {
    long sumOfSeries(long N) {

        // Recursive approach — Test cases fail for Large N
        // if(N == 0) return 0;
        // return (long)Math.pow(N, 3) + sumOfSeries(N-1);

        long n = N * (N + 1) / 2;
        return n * n; // Math.pow(n, 2);
    }
}