class Solution {

    void printDiamond(int n) {

        int height = 2 * n;
        int st, sp;

        for (int i = 1; i <= height; i++) {

            if (i <= n) {
                st = i;
                sp = n - i;
            } else {
                st = 2 * n - i + 1;
                sp = i - n - 1;
            }

            for (int j = 0; j < sp; j++)
                System.out.print(" ");

            for (int j = 0; j < st; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}