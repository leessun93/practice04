package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;	
		wonArray[2] = 5000;	
		wonArray[3] = 1000;	
		wonArray[4] = 500;	
		wonArray[5] = 100;	
		wonArray[6] = 50;	
		wonArray[7] = 10;	
		wonArray[8] = 5;	
		wonArray[9] = 1;	
		
		
		int result = 0;
		
		
		
		
		for(int i=0;i<wonArray.length;i++) {
			System.out.print("금액:");
			int money = sc.nextInt();
			
			
			for(int x=0; x<wonArray.length;x++) {
				
				
				System.out.println(wonArray[i] +"="+result+"개");
				
				if(wonArray[i]>money) {
					i++;
					money = money-wonArray[i]*result;
				}
				result= 0;
		
			
			}
			
			
			
			
			
						
	
	
		
		
		
		
		
		
		
		
		sc.close();
	}
	}
}

