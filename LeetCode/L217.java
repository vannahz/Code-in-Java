public class L217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
		int len = nums.length;
		for(int i=0; i<len; i++){
			if(set.contains(nums[i]))
				return true;
			
			set.add(nums[i]);
		}
		return false;
    }
}
