package com.soris.study.algorithm;

/**
 * 1���� 100���� ¦���� ���� ���ϴ� ���α׷�
 * @author �̼�
 * @since 2013. 6. 4.
 */
public class SumAl {
	public static void main(String[] args) {
		//Type : 1
		//[1] Init & Input
		int sum = 0;
		int i = 0;

		//[2] Process
		for(i = 0; i <= 100; i++) {
			if(i%2 == 0) {
				sum = sum + i;
			}
		}

		//[3] Output
		System.out.println("#1 : " + sum);

		//Type : 2
		//[1] Init & Input
		sum = 0;
		i = 1;

		//[2] Process
		while(i <= 100) {
			if(i%2 == 0) {
				sum = sum + i;
			}
			i++;
		}

		//[3] Output
		System.out.println("#2 : " + sum);
	}
}
