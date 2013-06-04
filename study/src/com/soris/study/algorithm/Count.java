package com.soris.study.algorithm;

/**
 * 나열된 수중에서 짝수의 갯수를 구하는 예제
 * @author 이솔
 * @since 2013. 6. 4.
 */
public class Count {
	public static void main(String[] args) {
		//[1] Input
		int[] data = {10, 8, 7, 3, 5};
		int count = 0;

		//[2] Process
		for (int i = 0; i < data.length; i++) {
			if(data[i]%2 == 0) {
				count++;
			}
		}

		//[3] Output
		System.out.println("짝수의 건수 : " + count);
	}
}
