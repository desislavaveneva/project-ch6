package gr.aueb.dt.ch6;

public class ProjectOne {

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null || low < 0 || high >= arr.length || low > high) {
            throw new IllegalArgumentException("Invalid array!");
        }

        int maxPos = low;
        int maxValue = arr[low];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPos = i;
            }
        }

        return maxPos;
    }

    public static void main(String[] args) {
        int[] array = {16, 55, 44, 63, 23, 12, 4};
        int low = 1;
        int high = 6;

        try {
            int maxPosition = getMaxPosition(array, low, high);
            System.out.println("The position of the maximum element is: " + maxPosition);
            System.out.println("The maximum element in the range is: " + array[maxPosition]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}