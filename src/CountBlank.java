import java.util.Scanner;
public class CountBlank {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        System.out.println("英語の文を入力してください");
        String inputStr = in.nextLine();
        char tmpChar;
        int countBlank = 0;
        
        for(int i=0;i<inputStr.length();i＋＋)
        	tmpChar = inputStr.charAt(i);
            if(tmpChar == ' ') {
                countBlank＋＋;
            }
	   
       }
	   System.out.println("文字列 [" ＋ inputStr ＋ "」"
			   ＋"に含まれる空白文字は" ＋ countBlank ＋ "個です。")
       
	}

}
