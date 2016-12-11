
public class L9_1_MaxProfit {

	public static int solution(int[] A) {
        
		
		int len = A.length;
		
		if(len == 0) return 0;
		
		int min = A[0];
		int profit = 0;
		
		for(int i=1; i<len; i++){
			
			min = Math.min(min, A[i]);
			
			profit = Math.max(profit, A[i]-min);
			
		}
		
		return profit;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {10, 2, 5, 4, 3, 7};
		
		System.out.println(solution(A));
	}

}
