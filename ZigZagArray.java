// https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
// Convert array into Zig-Zag fashion

public class S1 {

    public void zigZag(int a[], int n) {

        for (int i = 0; i < n - 1; i++) {

            if (i % 2 == 0) {

                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }

            } else {

                if (a[i] < a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }

            }

        }
    }
}
