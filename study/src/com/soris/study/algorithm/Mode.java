package com.soris.study.algorithm;

/**
 * 주어진 수들 중에서 빈도수가 많은 값 구하기
 * 최빈값(MODE) : 가장 많이 나타난 값 -> 데이터의 인덱스의 카운트(count) 값의 최대값(Max)
 * @author 이솔
 * @since 2013. 6. 4.
 */
public class Mode {
	public static void main(String[] args) {
		//[1] 입력 : 범위 = 0부터 5까지의 값만 들어온다는 가정
		int[] data = {1, 3, 4, 3, 5};
		int mode = 0;
		int[] index = new int[6]; // 0~5까지 : 인덱스의 카운터
		int max = Integer.MIN_VALUE; // 최대값을 저장하기 위한 변수; 초기값을 정수형의 최소값 지정

		//[2]
		/**
		 * data 배열에 있는 값들이 (1, 3, 4, 3, 5) index배열의 인덱스로 사용되어 카운트 된다.
		 * 카운트 되어 index의 저장된 값들 중에서 최대값을 구하는게 포인트.
		 * 최대값을 가지고 있는 index의 인덱스가 최빈값이 되고, 그 인덱스에 저장된 값이 반복된 수이다.
		 */
		for (int i = 0; i < data.length; i++) {
			index[data[i]]++; // count
		}

		for (int i = 0; i < index.length; i++) {
			if(max < index[i]) {
				max = index[i]; // MAX
				mode = i; // 최빈값 MODE
			}
		}

		System.out.println("최빈값 : " + mode + " , " + max +"번");
	}
}
