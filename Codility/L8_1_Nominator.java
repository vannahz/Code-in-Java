import java.util.HashMap;
import java.util.Map;

public class Solution8_2 {

	public static int solution(int[] A) {
		
		if(A.length == 1) return 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();	
		
		for(int i=0; i<A.length; i++){
			
			if(!map.containsKey(A[i]))
				map.put(A[i], 1);
			else{
				map.replace(A[i], map.get(A[i])+1);
				
				if(map.get(A[i]) > A.length/2)
					return i;
			}
		}
		
		return -1;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1, 2, 1, 3, 3, 3};
		
		System.out.println(solution(A));
	}

}
