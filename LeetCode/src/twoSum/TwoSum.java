package twoSum;

public class TwoSum {
	
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
        	
            // Must be i + 1 rather only 1 to avoid reusing same index twice
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
