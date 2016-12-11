
public class L9_2_MaxSliceSum {

	public static int solution(int[] A) {
        
		int len = A.length;
		
		int sum = A[0];
		int max = A[0];
		
		for(int i=1; i<len; i++){
			
			sum = Math.max(sum + A[i], A[i]);
			max = Math.max(sum, max);
		}
		
		return max;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {10, 2, -11, 12, -7, 9};
		
		System.out.println(solution(A));
	}

}
