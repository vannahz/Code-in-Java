public class L1 {
    public int[] twoSum(int[] nums, int target) {
        int[] A = new int[2];
		
		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				
				if( (nums[i] + nums[j]) == target){
					A[0] = i;
					A[1] = j;
					return A;
				}
			}
		}
		
		return A;
    }
}
