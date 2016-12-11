
public class L10_2_MinPerimeterRectangle {

	public static int solution(int N) {
        
		int sqrt = ((Double)Math.sqrt(N)).intValue();
		
		int min = (N+1)*2;
		
		for(int i=1; i<=sqrt; i++){
			
			int tmp = 0;
			if(N%i == 0){
				
				tmp = (i + N/i)*2;
				min = Math.min(tmp, min);
			}
		}
		
		return min;
		
    }
	
	
	public static void main(String[] args) {

		System.out.println(solution(30));
	}

}
