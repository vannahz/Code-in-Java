public class L14 {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
		
		if(strs == null || len == 0)
			return "";
		
		String prefix = strs[0];
		for(int i=1; i<len; i++){
			
			int j=0;
			while(j<strs[i].length() && j<prefix.length() && prefix.charAt(j) == strs[i].charAt(j))
				j++;
			if(j == 0) return "";
			
			prefix = prefix.substring(0, j);
		}
		
		return prefix;
    }
}
