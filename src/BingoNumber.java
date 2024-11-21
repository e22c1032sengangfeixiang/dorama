import java.util.Scanner;
public class BingoNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        System.out.println("最大値は？");
        int input = in.nextInt();
        int[] bingo = new int[input];
        
        System.out.print("[");
        for(int i=1;i<=input;i++)  {
        	bingo[i－1] = i;
        	System.out.print(bingo[i－1]+",");
        }
        System.out.println("]");
        
        int tmp = 0;
        }
        
	}

}
