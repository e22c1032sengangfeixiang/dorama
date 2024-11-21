import java.util.Scanner;
public class Magic {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
	    int input = in.nextInt();
	    //奇数化偶数かの判定
	    while((input%2)==0)  {
	    	System.out.println("奇数を入力してね");
	    	input = in.nextInt();
	    }

       int[] [] magic = new int[input] [input];    
       int y = 0;
       int x = input/2;
       
       
       
       
     for(int i=1;i<=input*input;i++)  {
    	   magic[y] [x] = i;
    	   if(i%input==0)  {
    		   y += 1;
    	   }else {
    		   x += 1;
    		   y －=1;
    	   }
    	   }
      }
        
	
	
	
	
	
	
        
