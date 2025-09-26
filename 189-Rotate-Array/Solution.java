class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = array[i]; 
        }
    }
}
