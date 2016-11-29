import java.util.Scanner;

public class WirelessRouter {

	static int rooms = 0, routers = 0;
	static int[] s;  //s[i]
	static int[][] admatrix;   //adjacent matrix
	static int max;
	static int peak;
	static int[] room;
	static int[] vis;
	static boolean isGo = true;
	
	static void initialization(){
		s = new int[1001];
		admatrix = new int[1001][1001];
		for(int i=0; i<1001; i++){
			s[i] = 0;
			for(int j=0; j<1001; j++){
				if(i == j) admatrix[i][j] = 1;
				else admatrix[i][j] = 0;
			}
		}
	}

	static void inputReader(){
		
		Scanner in = new Scanner(System.in);
		
		rooms = in.nextInt();
		routers = in.nextInt();
		
		for(int i=1; i<=rooms; i++)
			s[i] = in.nextInt();
		
		for(int i=1; i<rooms; i++){
			int row, col;
			row = in.nextInt();
			col = in.nextInt();
			admatrix[row][col] = 1;
			admatrix[col][row] = 1;           //1 means a door exists.
		}

		room = new int[rooms+1];
		vis = new int[rooms+1];
		for(int i=1; i<=rooms; i++){
			room[i] = i;
			vis[i] = 0;
		}
		
		peak = 0;     //cut edges
		for(int i=1; i<=rooms; i++)
			peak += s[i];
	}

	static void combination(int data[], int start, int end, int index)
    {
		
        if (index == routers+1)
        {
        	int score = 0;
        	for(int i=1; i<=rooms; i++)   //initial vis[]
    			vis[i] = 0;
        	
            for (int j=1; j<=routers; j++){          //selected rooms
            	for(int i=1; i<=rooms; i++){
            		
            		if(admatrix[data[j]][i] == 1)
            			vis[i] = 1;
            	}
            }
                
            for(int i=1; i<=rooms; i++){
            	if(vis[i] == 1)
            		score += s[i];
            }
            
            if(max < score)
            	max = score;
            
            if(score == peak)
            	isGo = false;
            return;
        }

        for (int i=start; i<=end && end-i+1 >= routers-index; i++)
        {
        	if(!isGo) return;
            data[index] = room[i];
            combination(data, i+1, end, index+1);
        }
    }
	
	public static void main(String[] args) {
		
		  initialization();
		  inputReader();

		  max = 0;
      int data[]=new int[routers + 1];   //index equal to room No.
      combination(data, 1, rooms, 1);
		
		
      System.out.println(max);
	}
}
