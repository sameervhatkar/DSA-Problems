package LeetCode.Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
        There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.

        You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

        Return a list of groups such that each person i is in a group of size groupSizes[i].

        Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. It is guaranteed that there will be at least one valid solution for the given input.



        Example 1:

        Input: groupSizes = [3,3,3,3,3,1,3]
        Output: [[5],[0,1,2],[3,4,6]]
        Explanation:
        The first group is [5]. The size is 1, and groupSizes[5] = 1.
        The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
        The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
        Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
        Example 2:

        Input: groupSizes = [2,1,3,3,3,2]
        Output: [[1],[0,5],[2,3,4]]


        Constraints:

        groupSizes.length == n
        1 <= n <= 500
        1 <= groupSizes[i] <= n
 */
public class Problem1282 {
    public List<List<Integer>> groupThePeople(int[] arr) {
        int len = arr.length;
        Map<Integer, List<Integer>> hMap = new HashMap<>();
        for(int i = 0; i < len; i++) {
            if(hMap.containsKey(arr[i])) {
                List<Integer> list = hMap.get(arr[i]);
                list.add(i);
                hMap.put(arr[i], list);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hMap.put(arr[i], list);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> set : hMap.entrySet()) {
            if(set.getKey() != set.getValue().size()) {
                int n = set.getValue().size()/set.getKey();
                for(int i = 0; i < n; i++) {
                    List<Integer> list = new ArrayList<>();
                    for(int j = 0; j < set.getKey(); j++) {
                        list.add(set.getValue().get(j + (i * set.getKey())));
                    }
                    ans.add(list);
                }
            }
            else {
                List<Integer> list = new ArrayList<>();
                for(int i = 0; i < set.getValue().size(); i++) {
                    list.add(set.getValue().get(i));
                }
                ans.add(list);
            }
        }
        return ans;

    }
}
