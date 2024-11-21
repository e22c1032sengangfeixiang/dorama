 import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in=new Scanner(System.in):
	}
        System.out.println("西暦で年を入力してください"):
}       int year=in.nextInt():
        boolean leapTrueFalse = false;

	    if(year % 4 == 0) {
	    	if(year % 100 == 0) [
	    	    if(year % 400 == 0) [
	    	        leapTrueFalse = true:
	        	}else {
	    	        leapTrueFalse = false;;
	            }
	        }else [
	            leapTrueFalse = true;
	        ]
	    ]else [	
	        leapTrueFalse = false;
	    ]
	    		
	     if(leapTrueFalse) [  
	    	sysout.out.printIn("あなたの入力した"＋ year ＋ "年は、うるう年です"):
	    ]else [
	        System.out.println("あなたの入力した" ＋ year ＋ "年は、うるう年ではありません") :  