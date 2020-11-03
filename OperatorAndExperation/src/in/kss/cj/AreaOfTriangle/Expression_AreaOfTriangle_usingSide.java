package in.kss.cj.AreaOfTriangle;


import java.util.Scanner;

public class Expression_AreaOfTriangle_usingSide {

	public static void main(String[] args) {
		int side1=0, side2=0,side3=0;
		float s=0.0f;//for semi_perimeter
		double area=0.0f;//math.sqrt returns double type
		Scanner scn=null;
		
		scn=new Scanner(System.in);
		
		
		
		System.out.println("enter the three sides of a triangle");
		System.out.println("side1=");
		side1=scn.nextInt();
		System.out.println("side2=");
		side2=scn.nextInt();
		System.out.println("side3=");
		side3=scn.nextInt();
		
		s=(side1+side2+side3)/2f;
		
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("Area of Triangle is "+area);
		
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
