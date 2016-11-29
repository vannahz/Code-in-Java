public class L3_1_FrogJmp {

	public static int solution(int[] A) {
	
		
		if(A.length == 0) return 0;
		
		int sum = 0;
		for(int i=0; i<A.length; i++)
			sum += A[i];
		
		System.out.println("sum " + sum);
		
		int min = -1001;
		int tempsum = 0;
		for(int i=0; i<A.length-1; i++){
			
			tempsum += A[i];
			
			System.out.println("tmp " + tempsum);
			
			int div = Math.abs(sum - 2*tempsum);
			
			
			if(min == -1001) min = div;
			
			else if(div < min) min = div;
			
			System.out.println("div " + div);
			
			System.out.println();
		}
		
		return min;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {1, -1};
		
		System.out.println(solution(A));
    	
	}
}
