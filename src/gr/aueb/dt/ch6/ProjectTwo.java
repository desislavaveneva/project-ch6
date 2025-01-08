package gr.aueb.dt.ch6;

public class ProjectTwo {

    public static int findSecondSmallestElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array does not contain enough distinct elements.");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] array = {44, 4, 16, 23, 12, 63, 55};

        try {
            int secondSmallest = findSecondSmallestElement(array);
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
