inport java.util.Scanner;
public class Aster {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in) ;
        System.out.print("いくつ*を出力しますか");
        int inputNum =in.nextInt();
        
        for(int i=1;i<=inputNum;i＋＋)  {
        	if(i%10==0)  {
        		System.out.print("@");
        	}else{
        		System.out.print("*");
        	}
        }
        System.out.println("");
        String str ="";
        for(int i=1;i<=inputNum;i＋＋)  {
        	if(i%10==0)  {
        		str ＋= "@";
        	}else{
        		str ＋= "*";
        	}
        }
	}
    System.out.println(str);
}
