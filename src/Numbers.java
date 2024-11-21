import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in =  new Scanner(System.in);
        
        int[] numbers = {3,4,9};
        
        System.out.println("１桁の数字を入力してください");
        int input = in.nextInt();
        
        for(int e:numbers)  {
        	if(e==input)  {
        		System.out.println("アタリ！");
        	}
        }
	}

	
}
