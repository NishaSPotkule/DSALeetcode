class Solution {
    public String kthLargestNumber(String[] nums, int k) {

        int target = nums.length - k;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int pivotIndex = partition(nums, left, right);

            if (pivotIndex == target) {
                return nums[pivotIndex];
            } 
            else if (pivotIndex < target) {
                left = pivotIndex + 1;
            } 
            else {
                right = pivotIndex - 1;
            }
        }

        return "";
    }

    private int partition(String[] nums, int left, int right) {

        String pivot = nums[right];
        int i = left;

        for (int j = left; j < right; j++) {

            if (compare(nums[j], pivot) <= 0) {
                String temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        String temp = nums[i];
        nums[i] = nums[right];
        nums[right] = temp;

        return i;
    }

    private int compare(String a, String b) {

       
        if (a.length() != b.length()) {
            return Integer.compare(a.length(), b.length());
        }

        
        return a.compareTo(b);
    }
}