
public class L10_1_CountFactors {

	public static int solution(int N) {
        
		int num = 0;
		int sqrt = ((Double)Math.sqrt(N)).intValue();
		
		for(int i=1; i<=sqrt; i++){
			
			if(N % i == 0){
				num++;
				
				if(N/i != i) num++;
			}
		}
		
		return num;	
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(25));
	}

}
