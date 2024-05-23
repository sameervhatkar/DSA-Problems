package LeetCode.Arrays.Easy;
/*
    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.



    Example 1:

    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    Example 2:

    Input: nums = [1,1,1,1]
    Output: 6
    Explanation: Each pair in the array are good.
    Example 3:

    Input: nums = [1,2,3]
    Output: 0


    Constraints:

    1 <= nums.length <= 100
    1 <= nums[i] <= 100
 */
public class GoodPairs {
    /*
    --------------My Approach --> O(n), O(n)---------------------
        public int numIdenticalPairs(int[] nums) {
            int len = nums.length;
            HashMap<Integer, Integer> hMap = new HashMap<>();
            for(int i = 0; i < len; i++) {
                int val = nums[i];
                if(hMap.containsKey(val))
                    hMap.put(val, hMap.get(val) + 1);
                else
                    hMap.put(val, 1);
            }
            int ans = 0;
            for(Map.Entry<Integer, Integer> set : hMap.entrySet()) {
                int val = set.getValue();
                ans += (val * (val - 1))/2;
            }
            System.gc();
            return ans;
        -----------------------------------------------------------
     */

    //Another Approach by some LeetCode User --> O(n), 102->(O(1))
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        int len = nums.length;
        for(int i = 0; i < len; i++)
            arr[nums[i]]++;

        int res = 0;
        for(int i = 0; i < 101; i++) {
            int val = arr[i];
            res += (val * (val - 1))/2;
        }
        return res;
    }
}
