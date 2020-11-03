package in.kss.cj.AreaOfTriangle;

import java.util.Scanner;

public class Expression_AreaOfTriangle {
	public static void main(String[] args) {
		float base=0.0f,height=0.0f,area=0.0f;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter base and height ");
		System.out.print("base= ");
		base=scn.nextFloat();
		
		System.out.print("Height= ");
		height=scn.nextFloat();
		 
		area=base*height/2;
		
		System.out.println();
		System.out.println("Area of triangle is :"+area);
		
		
	}

}
