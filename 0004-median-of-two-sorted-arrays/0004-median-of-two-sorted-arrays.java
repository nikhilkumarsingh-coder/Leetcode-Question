class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        int[] arr = new int[n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (j < nums1.length) {
            arr[i++] = nums1[j++];
        }

        while (k < nums2.length) {
            arr[i++] = nums2[k++];
        }

        Arrays.sort(arr);

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}