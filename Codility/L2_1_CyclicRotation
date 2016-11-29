
public class L2_1_CyclicRotation {

	public static int solution(int[] A) {
		

		int i = 0;	
		for(int j=A.length-1; j>=0; j--){
			
			while(A[i] == -1) i++;
			while(A[j] == -1) j--;
			
			if(i == j) return A[i];
			
			else if(A[i] == A[j]){
				
				A[i] = -1;
				A[j] = -1;
				i++;
				j = A.length;
			}
			
		}
		
		return -1;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {9};
		
    	System.out.println(solution(A));
    	
	}
}
