/* 

Input:
A = 5 , B = 10

Output:
10 5

Explanation:
LCM of 5 and 10 is 10, while
thier GCD is 5. 

*/

class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {

        // Euclidean Algorithm
        /*
         * Let 'b' be smaller than 'a'
         * gcd(a, b) = gcd(a - b, b);
         * WHY ?
         * Let 'g' be GCD of 'a' and 'b'
         * a = gx, b = gy and GCD(x, y) = 1
         * (a-b) = g(x-y)
         */

        Long gcd = gcd(A, B);

        // a*b = gcd(a, b) * lcm(a, b) i.e (a*b) / gcd(a, b) = lcm(a, b)
        Long lcm = (A * B) / gcd;

        return new Long[] { lcm, gcd };
    }

    // T.C : log(min(a, b))
    static Long gcd(Long a, Long b) {

        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
};