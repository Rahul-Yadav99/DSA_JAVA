public class Problem {

    static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];
        }
        return min;
    }

    static int minElementsIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[minIndex] > nums[i])
                minIndex = i;
        }
        return minIndex;
    }

    static void printSubArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int s = i;
            for (int j = i; j < nums.length; j++) {
                int e = j;
                for (int k = s; k < e; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // find the min element in this given array and return the index of the element
        int[] nums = { 3, 4, 5, 1, 2 };
        
    }
}
