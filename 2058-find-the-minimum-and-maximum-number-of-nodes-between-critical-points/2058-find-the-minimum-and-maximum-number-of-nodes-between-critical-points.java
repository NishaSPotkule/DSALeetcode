class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;

        int position = 1;

        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        while (curr != null && curr.next != null) {

            // Check local maxima or local minima
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                // First critical point
                if (first == -1) {
                    first = position;
                } 
                else {
                    // Distance from previous critical point
                    minDistance = Math.min(minDistance, position - last);
                }

                // Update previous/last critical point
                last = position;
            }

            prev = curr;
            curr = curr.next;
            position++;
        }

        // Fewer than two critical points
        if (first == -1 || first == last) {
            return ans;
        }

        int maxDistance = last - first;

        return new int[]{minDistance, maxDistance};
    }
}