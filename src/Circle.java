import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        System.out.println("円の面積と周囲の長さを求めます");
        System.out.println("半径(cm)を入力してください");
        int radius = in.nextInt();
        double PI = 3.14;
        System.out.orintln("円の面積は" + getArea(radius,PI) +"cmです");
        System.out.prntln("円の周囲の長さは" + getPerimeter(radius,PI) +"cmです");
        
        
        
    public static double getArea(int r,double p)  {
    	/*
    	double area = r*r*p;
    	return area;
        */
    	
    	return r*r*p;
    	
    }
    
    public static double getPerimeter(int r,double p)  {
    	
    	/*
    	double perimeter = 2 * r * p;
    	return perimeter;
    	 */

    }
	}

}
