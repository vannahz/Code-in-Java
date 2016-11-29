import java.util.Stack;

public class L7_2_Brackets {
	
	public static int solution(int[] A, int[] B) {
	
		int num = 0;  //stands for eaten fish.
		
		Stack<Integer> downstream = new Stack<Integer>();
		
		for(int i=0; i<A.length; i++){
			
			if(B[i] == 1)
				downstream.push(A[i]);
			else{
				
				if(downstream.isEmpty())
					continue;
				
				
				while(!downstream.isEmpty()){
					
					int fish = downstream.peek();
					num++;
					
					if(fish < A[i])
						downstream.pop();
					else
						break;
				}
			}
		}
		return A.length - num;
		
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {4};
		int[] B = {0};
		
		System.out.println(solution(A, B));
    	
	}
}
