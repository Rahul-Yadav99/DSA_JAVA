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

    static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void sumOFSubarr(int[] nums) {
        int k = 3;
        int win_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            win_sum = win_sum + nums[i];
        }
        max_sum = win_sum;
        for (int i = k; i < nums.length; i++) {
            win_sum = win_sum - nums[i - k] + nums[i];
            max_sum = Math.max(max_sum, win_sum);
        }
        System.out.println(max_sum);
    }

    public static void printMaxElementInSubarr(int[] nums) {
        int k = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        // find the min element in this given array and return the index of the element
        int[] nums = { 3, 4, 5, 11, 2, 6 };
        // printMaxElementInSubarr(nums);
        for (int i = 0; i <= 1000000; i++) {
            System.out.println(i);
        }
    }
}