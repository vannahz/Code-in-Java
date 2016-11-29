public class L3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
	     int[] C = new int[256];  //represent character.
	     int j=0;
	     for(int i=0; i<s.length(); i++){
	    	 while(j<s.length() && C[s.charAt(j)] == 0){
	    		 C[s.charAt(j)] = 1;
	    		 ans = Math.max(ans, j-i+1);
	    		 j++;
	    	 }
	    	 C[s.charAt(i)] = 0;
	     }
		 return ans;
    }
}
