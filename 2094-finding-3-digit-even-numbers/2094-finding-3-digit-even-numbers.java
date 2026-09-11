class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];

       
        for (int d : digits) {
            freq[d]++;
        }

        int[] temp = new int[900];
        int index = 0;

        for (int num = 100; num <= 999; num++) {

         
            if (num % 2 != 0) {
                continue;
            }

            int n = num;
            int[] need = new int[10];

       
            while (n > 0) {
                need[n % 10]++;
                n /= 10;
            }

            
            boolean possible = true;

            for (int i = 0; i < 10; i++) {
                if (need[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                temp[index++] = num;
            }
        }

        int[] ans = new int[index];

        for (int i = 0; i < index; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}