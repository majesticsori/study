package com.soris.study.algorithm;

/**
 * 주어진 값들에서 최소값과 최대값을 구하는 예제
 * @author 이솔
 * @since 2013. 6. 3.
 */
public class Max {
	public static void main(String[] args) {
		//[0] Init
		int max = Integer.MIN_VALUE; // 정수형 데이터 중 가장 작은 값으로 초기화
		int min = Integer.MAX_VALUE; // 정수형 데이터 중 가장 큰 값으로 초기화

		/*
		 * Field descriptor #68 I
		 * public static final int MIN_VALUE = -2147483648;
		 *
		 * Field descriptor #68 I
		 * public static final int MAX_VALUE = 2147483647;
		 */

		//[1] Input
		int[] data = {-2, -5, -3, -7, -1};

		//[2] Process : MAX & MIN
		for (int i = 0; i < data.length; i++) {

			//[-] 최대값(MAX)
			if(data[i] > max) {	// data[i] 값이 max보다 크면
				max = data[i];	// data[i]의 값을 max에 저장
			}

			//[-] 최소값(MIN)
			if(data[i] < min) {
				min = data[i];
			}
		}

		//[3] Output
		System.out.println("# 최대값 : " + max);
		System.out.println("# 최소값 : " + min);
	}
}
