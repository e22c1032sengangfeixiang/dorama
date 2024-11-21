
public class Toukei2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        
        System.out.print("何人分入力しますか？:");
        int count = in.nextInt();
        
        int[] scores = new int[count];
	
	    for(int i=0;i<count;i＋＋)  {
	    	System.out.print("点数を入力してください");
	    	scores[i] = in.nextInt();
	    }
	    
	    /*
	    for(int e:tests) {
	        System.out.println(e);
	    }
	     */


