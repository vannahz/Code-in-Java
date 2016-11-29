import java.util.HashSet;
import java.util.Set;

public class L4_3_MissingInteger {

	public static int solution(int[] A) {
	
		Set<Integer> target = new HashSet<Integer>();
		
		for(int i=0; i<A.length; i++)
			target.add(i + 1);
		
		for(int i=0; i<A.length; i++){
			
			if(target.contains(A[i])) 
				target.remove(A[i]);
			
		}
		
		return (target.isEmpty())?(A.length+1):target.stream().findFirst().get();
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {-1, 3, 6, 4, -1, 2};
		
		System.out.println(solution(A));
    	
	}
}
