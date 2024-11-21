import java.util.Scanner;
public class HitBlow {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int[] targetList = {0,1,2,3,4,5,6,7,8,9};
        int[] target = new int[4];
        
        for(int n=1;n<=1000;n++)  {
        	int i=(int) (Math.random()*10);
        	int j=(int) (Math.random()*10);
        	int tmp = targetList[i];
        	targetList[i] = targetList[j];
        	targetList[j] = tmp;
        }
        
        for(int i=0;i<4;i++)  {
        	target[i] = targetList[i];
        	System.out.print("["+ target[i]+"]");
        }
        
        //ユーザの入力した４桁の数字を取り出して配列に格納
        Scanner in = new Scanner(System.in);
        int hit = 0;
        int blow =0;
        int count = 0;
        
        while(hit < 4)  {
        	hit = 0;
        	blow = 0;
        	System.out.println("\n数字を入力してください");
        	int guessA = in.nextInt();
        	int[] guess = new int[4];
        	guess[0] = guessA/1000;
        	guess[1] = (guessA%1000)/100;
        	guess[2] =(guessA%100)/10;
        	guess[3] = guessA%10;
        	
        	
        	for(int i=0;i<4;i++)  {
        		System.out.print("[");
        		System.out.print(guess[i]);
        		System.out.print("]");
        	
        	System.out.println("");
        	
        	for(int i=0;i<4;i++);
        	}
        }
	}

}
