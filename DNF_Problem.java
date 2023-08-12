// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
// Sort an array of 0s, 1s and 2s | Dutch National Flag problem

public class S2 {

    public static void sort012(int a[], int n) {

        int l = 0, m = 0, h = n - 1;

        while (m <= h) {
            if (a[m] == 0) {
                int t = a[l];
                a[l] = 0;
                a[m] = t;
                l++;
                m++;
            } else if (a[m] == 1) {
                m++;
            } else if (a[m] == 2) {
                int t = a[h];
                a[h] = 2;
                a[m] = t;
                h--;
            }
        }

    }

    // public static void sort012(int a[], int n) {

    // int x = 0;

    // for (int i = x; i < n; i++) {
    // if (a[i] == 0) {
    // int t = a[x];
    // a[x] = 0;
    // x++;
    // a[i] = t;
    // }
    // }

    // for (int i = x; i < n; i++) {
    // if (a[i] == 1) {
    // int t = a[x];
    // a[x] = 1;
    // x++;
    // a[i] = t;
    // }
    // }

    // for (int i = x; i < n; i++) {
    // if (a[i] == 2) {
    // int t = a[x];
    // a[x] = 2;
    // x++;
    // a[i] = t;
    // }
    // }

    // }
}