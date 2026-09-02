class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            long sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == x || check(sum, x)) {
                    count++;
                }
            }
        }

        return count;
    }

    boolean check(long n, int x) {
        long lastDigit = n % 10;

        while (n >= 10) {
            n /= 10;
        }

        long firstDigit = n;

        return firstDigit == x && lastDigit == x;
    }
}