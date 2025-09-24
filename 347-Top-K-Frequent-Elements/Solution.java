import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1); 
            }
            else
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int freq = entry.getValue();

            if (buckets[freq] == null)
            {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;

        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index++] = num;
                    if (index == k) break;
                }
            }
        }

        return result;
    }
}