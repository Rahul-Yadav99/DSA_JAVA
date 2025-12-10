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

    static void binarySearchonRotatedArr(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int x = 5;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == x) {
                System.out.println(mid);
                return;
            }

            // Check if left part is sorted
            if (nums[s] <= nums[mid]) {
                // Check if x lies in the sorted left part
                if (x >= nums[s] && x < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // Right part is sorted
            else {
                // Check if x lies in the sorted right part
                if (x > nums[mid] && x <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        // find the min element in this given array and return the index of the element
        int[] nums = { 3, 4, 5, 1, 2 };
        binarySearchonRotatedArr(nums);
    }
}