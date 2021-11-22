package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5];
		double i;
		double result = 0;
		
		
		
		for(i=0; i<num.length; i++) {
			
			int su = sc.nextInt();
			
			
			
	
			result = result + su;
		}
		System.out.println(result/num.length);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
