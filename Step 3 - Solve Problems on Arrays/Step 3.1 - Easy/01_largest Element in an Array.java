/*
 * 
 * Input:
 * n = 5
 * A[] = {1, 8, 7, 56, 90}
 * Output:
 * 90
 * 
 */

class Compute {

    public int largest(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }
}