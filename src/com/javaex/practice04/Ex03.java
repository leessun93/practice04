package com.javaex.practice04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0;i<intA.length;i++) {
			System.out.println(intA[i]);
		}
		
		
	// 이경우 인트 b가 a값을 갖는다 선언했으니 3 6 9 였지만 0번과 2번 그러니까 첫번째 3번째를 20과 10으로 바꾸어주어 포문에서 인트 a만큼 출력하는데 인트 a는 20 6 10이다 왜냐하면
		//인트 b와 a는 독립된 값이 아닌 같은 주소를 쓰기 때문이다.
	}

}
