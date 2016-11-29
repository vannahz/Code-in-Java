import java.util.stream.IntStream;

public class L3_3_TapeEquilibrium {

	public static int solution(int[] A) {
			
		int[] B = new int[A.length+1];
		
		for(int i=0; i<B.length; i++)
			B[i] = i+1;
		
		int sum1 = IntStream.of(A).sum();
		int sum2 = IntStream.of(B).sum();
		
		return sum2 - sum1;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {1, 2, 3, 5};
		
		System.out.println(solution(A));
    	
	}
}
