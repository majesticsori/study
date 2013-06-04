package com.soris.study.algorithm;

/**
 * 주어진 수들 중에서 지정한 수와 가장 가까운 수 찾기 예제
 * 가까운 값(Near) : 차이값의 절대값의 최소값...
 * @author 이솔
 * @since 2013. 6. 4.
 */
public class Near {
	public static void main(String[] args) {
		//[1] Input
		int[] data = {10, 20, 30, 27, 17};
		int target = 25; // 찾을 값 지정
		int near = 0;
		int min = Integer.MAX_VALUE; // 차이 값의 절대값의 최소값을 저장 할 변수

		//[2] Process
		for (int i = 0; i < data.length; i++) {
			int a = Math.abs((data[i] - target));  // Math.abs(값) : 절대값 구하는 함수
			//int a = Abs((data[i] - target));
			if(min > a) {
				min = a; // 최소값 알고리즘
				near = data[i]; // 최종적으로 가까운 값
			}
		}

		//[3] Output
		System.out.println(target + "와 가까운 값 : " + near);
	}

	/**
	 * 절대값 구하는 메소드
	 *
	 * 넘겨받은 num이 0보다 작으면 -부호를 붙여 +로 바꾼다.
	 * ex) (-1 < 0) 이면 -(-1)이 되어 1로 계산된다.
	 *
	 * @param num
	 * @return
	 */
	public static int Abs(int num) {
		return (num < 0) ? -num : num;
	}
}
