class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if (nums.length == 0) {
            return 0;
        }
        int leftPointer = 0;
        
        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++)
        {
            if(nums[leftPointer] != nums[rightPointer])
            {
                leftPointer++;
                nums[leftPointer] = nums[rightPointer];
            }
        }
        return leftPointer + 1;
    }
}