package Easy;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];

        int right = nums.length - 1;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[right] = 0;
                right--;
            } else {
                ans[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}