package LeetCode.Arrays.Easy;

/*
    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

    Specifically, ans is the concatenation of two nums arrays.

    Return the array ans.



    Example 1:

    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    - ans = [1,2,1,1,2,1]
    Example 2:

    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
    - ans = [1,3,2,1,1,3,2,1]


    Constraints:

    n == nums.length
    1 <= n <= 1000
    1 <= nums[i] <= 1000
 */

public class ConcatenationOfArray {
    /*
       ---------------------------My Approach --> O(n), O(n)----------------------------
       public int[] getConcatenation(int[] nums) {
            int len = nums.length;
            int[] ans = new int[2 * len];
            for(int i = 0; i < len; i++) {
                ans[i] = nums[i];
                ans[i + len] = nums[i];
            }
            return ans;
        }
        ---------------------------------------------------------------------------------
     */

    //Another LeetCode User Appraoch  --> O(n), O(n) But my approach has runtime of 1ms and his approach has runtime of 0ms

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];

        System.arraycopy(nums, 0, arr, 0, n);
        System.arraycopy(nums, 0, arr, n, n);

        return arr;
    }
}
