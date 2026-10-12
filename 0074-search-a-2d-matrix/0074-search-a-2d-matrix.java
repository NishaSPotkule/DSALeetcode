class Solution {
    static boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0)
        return false;

    int rows = matrix.length, cols = matrix[0].length;
    int low = 0, high = rows * cols - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        int value = matrix[mid / cols][mid % cols];

        if (value == target) return true;
        if (value < target) low = mid + 1;
        else high = mid - 1;
    }
    return false;
}
}