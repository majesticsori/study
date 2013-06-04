package com.soris.study.algorithm;

/**
 * 80점 이상 95점 이하인 자료의 평균을 구하는 예제
 * @author 이솔
 * @since 2013. 6. 4.
 */
public class Avg {
	public static void main(String[] args) {
		//[1] Input
		int[] data = {50, 60, 78, 90, 95};
		int count = 0;
		int sum = 0;
		double avg = 0.0;

		//[2] Process : AVG
		for (int i = 0; i < data.length; i++) {
			if(data[i] >= 80 && data[i] <= 95) {
				count++; //80점 이상 95점 이하인 자료가 있으면 카운트 증가
				sum += data[i];
			}
		}

		// 참고 : int형 나누기 int형은 결과가 int형이다. 따라서 반드시 캐스팅 필요
		avg = sum / (double)count;

		//[3] Output
		System.out.println("80점 이상 95점 이하인 자료의 평균 " + avg);
		System.out.println("80~95 평균 => (double)로 형변환하지 않았을 경우 " + (sum/count));
	}
}
