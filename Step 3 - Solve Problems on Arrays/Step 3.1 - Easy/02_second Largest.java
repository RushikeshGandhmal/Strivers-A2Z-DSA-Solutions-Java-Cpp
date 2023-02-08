/*
 * 
 * Input:
 * N = 6
 * Arr[] = {12, 35, 1, 10, 34, 1}
 * Output: 34
 * 
 */

class Solution {
    int print2largest(int A[], int n) {

        // do array contains duplicate numbers ? - clarify the question

        int f = A[0], s = -1;

        for (int i = 1; i < n; i++) {

            if (A[i] > f) {
                s = f;
                f = A[i];
            } else if (A[i] < f)
                s = Math.max(s, A[i]);
        }
        return s;
    }
}