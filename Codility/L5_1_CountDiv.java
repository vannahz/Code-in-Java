public class L5_1_CountDiv {

	public static int solution(int[] A) {
	
		int one = 0;
		int sum = 0;
		
		for(int i=A.length-1; i>=0; i--){
			
			if(A[i] == 1)
				one++;
			else{
				sum += one;
			}
			
			if(sum > 1000000000)
				return -1;
		}
			
		return sum;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {1, 0};
		
		System.out.println(solution(A));
    	
	}
}
