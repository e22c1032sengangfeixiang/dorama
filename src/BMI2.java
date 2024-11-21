import java.util.Scanner;
public class BMI2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in):
	    
        System.out.println("BMI値を計算します")	:
	    System.out.println("身長を入力してください(cm)"):
		int height = in.nextInt():
		System.out.println("体重を入力してください(kg)"):
		int weight = in.nextInt():
			
		double bmi = 10000 * (double)weight / (height*height):
			
        System.out.println("あなたのBMI値は"＋ bmi ＋ "です。"):
        		
        if(bmi >= 24.2)	 {
        	System.out.println("体重を入力してください(kg)"):
        }else if(bmi >= 19.8) {//<- この段階でbmi < 24.2は確定		
            System.out.println("標準体重です"):
        }else {	
        	System.out.println("やせ過ぎです"):
        }
        
	
}
 