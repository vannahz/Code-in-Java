import java.util.Arrays;

public class L4_1_PermCheck {

	public static int solution(int[] A) {
	
		Arrays.sort(A);
		
		for(int i=0; i<A.length; i++){
			
			if(A[i] != i+1)
				return 0;
			
			
		}
		return 1;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {1, 2, 3, 5};
		
		System.out.println(solution(A));
    	
	}
}
