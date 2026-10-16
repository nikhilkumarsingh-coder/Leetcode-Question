class Solution {

    static int[] mergesort(int[] nums, int s, int e) {

        if (s == e) {
            return new int[]{nums[s]};
        }

        int mid = s + (e - s) / 2;

        int[] left = mergesort(nums, s, mid);
        int[] right = mergesort(nums, mid + 1, e);

        return fun(left, right);
    }

    static int[] fun(int[] a, int[] b) {

        int i = 0, j = 0, k = 0;

        int n = a.length;
        int m = b.length;

        int[] c = new int[n + m];

        while (i < n && j < m) {

            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n) {
            c[k++] = a[i++];
        }

        while (j < m) {
            c[k++] = b[j++];
        }

        return c;
    }

    public int[] sortArray(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }

        return mergesort(nums, 0, nums.length - 1);
    }
}