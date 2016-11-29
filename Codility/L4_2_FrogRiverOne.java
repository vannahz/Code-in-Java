public class L4_2_FrogRiverOne {

	public static int solution(int X, int[] A) {
	
		int[] B = new int[X+1];
		
		for(int i=0; i<B.length; i++)
			B[i] = X + 2;
		
		for(int i=0; i<A.length; i++){
			if(i < B[A[i]])
				B[A[i]] = i;
		}
			
		int max = 0;
		for(int i=1; i<B.length; i++)
			if(max < B[i]) max = B[i];
				
		if(max == X + 2) return -1;
		else
			return max;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {1};
		
		System.out.println(solution(1, A));
    	
	}
}
