import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineCode {

	public static int solution(int[] A) {
		
		Map<Integer, List> map = new HashMap<Integer, List>();
		
		for(int i=0; i<A.length; i++){
			if(map.containsKey(A[i])){
				map.get(A[i]).add(i);	
			}else{
				
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(A[i], list);
			}
		}
		
		
		Arrays.sort(A);
		int max = -1;
		for(int i=0; i<A.length-1; i++){
			
			if(A[i] == A[i+1]) continue;
			
			int tmp = 0;
			List<Integer> left = map.get(A[i]);
			List<Integer> right = map.get(A[i+1]);
			
			for(int ll:left){
				for(int rr: right){
					tmp = Math.abs(ll - rr);				
					if(max < tmp) max = tmp;
				}
			}
		}
		return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {0, 3, 3, 7, 5, 3, 11, 1};
		System.out.println(solution(A));	
	}
}
