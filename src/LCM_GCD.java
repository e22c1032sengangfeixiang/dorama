import java.util.Scanner;

public class LCM_GCD {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        System.out.println_("整数を２つ入力してください");
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        
        int lcm = 0;
        int gcd = 0;
        
        for(int i=1;i<=input2;++) {
        	lcm = input1*i;
        	if(lcm%input2==0)  {
        		break;
        	}
        }
	    for(int j=input1;j>=1;j--)  {
	    	if((input1%j==0)&&(input2%j==0))  {
	    		gcd = j;
	    		break;
	    	}
	    }

        System.out.println("最小公倍数 :"+lcm);
        System.out.println("最大公約数 :"+gcd);
        
