import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        System.out.println("長方形の面積と周囲の長さを求めます");
        System.out.println("長方形の高さ (c m) を入力してください"); 
        int vertical = in.nextInt();
        getArea(vertical,width);
        getPerimeter(vertical,width);
        
	
	}

 
    public static void getArea(int v, int w)  {
    	int area = v * w;
        System.out.println("長方形の面積は" + area +"cmです");
    }
    
    public static void getPerimeter(int v, int w)  {
    	int perimeter = (v*2)+(w*2);
    	System.out.println("長方形の周囲の長さは" + perimeter +"cmです");
    }