
public class L3_2_PermMissingElem {

	public static int solution(int X, int Y, int D) {
	
		int sol = (Y - X) / D + 1;
		
		int div = Y - X;
		
		sol = (div%D==0)? (div/D):(div/D+1);
		
		
		return sol;
    }
	
	
	public static void main(String[] args) {
		
		
		System.out.println(solution(10, 20, 1));
    	
	}
}
