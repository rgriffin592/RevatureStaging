package removeDuplicates;

public class RemoveDuplicates {
	
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        for(int i = k; i < nums.length; i++){
            // Check with next index if it's duplicate
            if(nums[i - 1] != nums[i]) {
                // Store unique element at k and increase k by 1
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
