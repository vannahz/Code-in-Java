public class L409 {
    public int longestPalindrome(String s) {
       
       char[] c = s.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		int len = c.length;
		
		int sum = 0;
		
		for(int i=0; i<len; i++){
			
			if(!set.contains(c[i])){
				set.add(c[i]);
				continue;
			}
			
			if(set.contains(c[i])){
				
				sum += 2;
				set.remove(c[i]);
			}
			
		}
		
		
		if(set.isEmpty())
			return sum;
		else
			return sum + 1;
        
    }
}
