import java.util.Stack;

public class L7_1_Fish {

	public static boolean isLeft(String s){
		
		if(s.equals("{") || s.equals("[") || s.equals("("))
			return true;
		else 
			return false;
		
	}
	
	public static boolean isPair(String left, String right){
		
		if(left.equals("{") && right.equals("}"))
			return true;
		else if(left.equals("[") && right.equals("]"))
			return true;
		else if(left.equals("(") && right.equals(")"))
			return true;
		else 
			return false;
	}
	
	
	public static int solution(String S) {
	
		if(S.length() == 0) return 1;
		
		String[] parts = S.split("");
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<parts.length; i++){
			
			if(isLeft(parts[i])) stack.push(parts[i]);
			else{
				
				if(stack.isEmpty()) return 0;
				
				String tmp = stack.peek();
				
				if(isPair(tmp, parts[i])){
					stack.pop();
					continue;
				}
				else return 0;
			}
		}
		
		//没有收好尾巴
		if(stack.empty())
			return 1;
		else
			return 0;
    }
	
	
	public static void main(String[] args) {
		
		//int[] A = {-3, 1, -5, 1, 1, 4, 2, 3};
		
		System.out.println(solution("[}{]}"));
    	
	}
}
