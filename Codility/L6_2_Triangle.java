import java.util.HashSet;
import java.util.Set;

public class L6_2_Triangle {

	public static int solution(int[] A) {
	
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<A.length; i++){
			
			if(!set.contains(A[i]))
				set.add(A[i]);
		}
		
		return set.size();
    }
	
	
	public static void main(String[] args) {
		
		int[] A = {-3, 1, 2, 1, 1, 1, 2, 3};
		
		System.out.println(solution(A));
    	
	}
}
