import java.util.HashMap;
import java.util.Map;

public class Solution8_1 {

	public static int solution(int[] A) {
    // write your code in Java SE 8
		
		int nom = 0;
		int nom_size = 0;
		int len = A.length;
		
		if(len == 1) return 0;
				
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();		
		
		for(int i=0; i<len; i++){
			
			if(!map.containsKey(A[i]))
				map.put(A[i], 1);
			else{
				map.replace(A[i], map.get(A[i])+1);
				
				if(map.get(A[i]) > len/2){
					
					nom = A[i];
					nom_size = map.get(nom);
				}
			}
			
		}// get nominator and its size.
		
		int eleader = 0;		
		int tmp = 0;
		for(int i=0; i<len; i++){
			
			if(A[i] == nom) //flag to show how many leaders up to now
				tmp++;
			
			if(tmp>(i+1)/2 && (nom_size-tmp)>(len-i-1)/2)
				eleader++;
		}		
		return eleader;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {3, 2, 1, 3, 3, 3, 3};
		System.out.println(solution(A));
	}

}
