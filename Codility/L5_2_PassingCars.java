
public class L5_2_PassingCars {

	public static int solution(int A, int B, int K) {
	
		int left;
		if(A % K == 0)
			left = A / K;
		else
			left = A / K + 1;
		
		int right = B / K;
			
		return right - left + 1;
    }
	
	
	public static void main(String[] args) {
		
		//int[] A = {0, 1, 0, 1, 1};
		
		System.out.println(solution(6, 9, 5));
    	
	}
}
