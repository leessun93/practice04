package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i=0; i<intArray.length;i++) {     //인트어레이 렝스와 같거나 작다라고 하면 0부터 5까지 6개가 잡힌다 따라서 미만으로 잡아주어야한다
			result=result+intArray[i]; // 3개의 값 3 7 12를 더한다
		}
		System.out.println(result); // 22
	}
	
}
