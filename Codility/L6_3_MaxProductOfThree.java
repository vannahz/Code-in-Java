import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L6_3_MaxProductOfThree {

	public static int solution(int[] A) {
	
		int len = A.length;
		
		if(len < 3) return 0;
		
		Arrays.sort(A);
		
		for(int i=0; i<len-2; i++){
			
			if(A[i] <=0 ) continue;
			
			if( (A[i] + A[i+1]) > A[i+2] )   //max int overflow
				return 1;
		}
		
		return 0;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {-3, 1, -5, 1, 1, 4, 2, 3};
		
		System.out.println(solution(A));
    	
	}
}
