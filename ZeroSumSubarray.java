import java.util.HashSet;

public class ZeroSumSubarray {

    public static String subarrayWithZeroSum(int[] arr) {
        int n = arr.length;
        int prefixSum = 0;
        HashSet<Integer> prefixSumSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0 || prefixSumSet.contains(prefixSum)) {
                return "Yes";
            }

            prefixSumSet.add(prefixSum);
        }

        return "No";
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {4, 2, -3, 1, 6};
        System.out.println(subarrayWithZeroSum(arr1)); // Output: Yes

        // Example 2
        int[] arr2 = {4, 2, 0, 1, 6};
        System.out.println(subarrayWithZeroSum(arr2)); // Output: Yes
    }
}