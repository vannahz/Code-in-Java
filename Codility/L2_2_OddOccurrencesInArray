public class L2_2_OddOccurrencesInArray {

	public static int[] solution(int[] A, int k) {
		
		int N = A.length;
		
		if(N == 0) return A;
		if(N < k)  k %= N;
		if(k == 0) return A;
		
		int[] B = A.clone();
		for(int i=0; i<B.length; i++)
			B[i] = (i<k)?A[N+i-k]:A[i-k];
			
		
		
		return B;
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {4, 3};
		
		int[] s = solution(A, 3);
		
		for(int i=0; i<s.length; i++)
			System.out.print(s[i] + " ");
    	
	}
}
