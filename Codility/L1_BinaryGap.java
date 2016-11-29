
class L1_BinaryGap {
	
    public static int solution(int N) {
    	
    	String str = Integer.toBinaryString(N) ;
    	
    	String[] bits = str.split("");
    	
    	int max = 0;
    	int st = 0, end = 0;
    	int div = 0;
    	for(int i=1; i<bits.length; i++){
    		
    		if(bits[i-1].equals("1") && bits[i].equals("0")){
    			st = i-1;
    		}else if(bits[i-1].equals("0") && bits[i].equals("1")){
    			end = i;
    			div = end - st - 1;
    			
    			if(max < div) max = div;
    		}
    	}
    	return max;
    }
    
    
    public static void main(String[] args) {
		
    	System.out.println(solution(1041));
    	
	}
}
