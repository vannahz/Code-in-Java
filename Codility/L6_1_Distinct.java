import java.util.Arrays;

public class L6_1_Distinct {

	public static int solution(int[] A) {
	
		Arrays.sort(A);
		
		int len = A.length;
		
		int multi1, multi2;
		
		multi1 = A[0] * A[1] * A[len-1];
		
		multi2 = A[len-3] * A[len-2] * A[len-1]; 
			
		if(multi1 > multi2) return multi1;
		else return multi2;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {-3, 1, 2, -1};
		
		System.out.println(solution(A));
    	
	}
}
