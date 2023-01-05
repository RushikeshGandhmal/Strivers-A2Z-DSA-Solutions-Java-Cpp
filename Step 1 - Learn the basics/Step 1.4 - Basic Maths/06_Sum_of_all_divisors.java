/* 

Input:
N = 4

Output:
15

Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15 
    
*/

class Solution {
    static long sumOfDivisors(int N) {

        // code here
        long sumTotal = 0;

        for (int i = 1; i <= N; i++) {

            sumTotal += (N / i) * i;
            // How many time 1 came, 2 came , 3 came : i.e. N/i
            // Multiply the number of occurence with the Number and get the sum
        }
        return sumTotal;
    }
}