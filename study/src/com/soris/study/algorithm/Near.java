package com.soris.study.algorithm;

/**
 * �־��� ���� �߿��� ������ ���� ���� ����� �� ã�� ����
 * ����� ��(Near) : ���̰��� ���밪�� �ּҰ�...
 * @author �̼�
 * @since 2013. 6. 4.
 */
public class Near {
	public static void main(String[] args) {
		//[1] Input
		int[] data = {10, 20, 30, 27, 17};
		int target = 25; // ã�� �� ����
		int near = 0;
		int min = Integer.MAX_VALUE; // ���� ���� ���밪�� �ּҰ��� ���� �� ����

		//[2] Process
		for (int i = 0; i < data.length; i++) {
			int a = Math.abs((data[i] - target));  // Math.abs(��) : ���밪 ���ϴ� �Լ�
			//int a = Abs((data[i] - target));
			if(min > a) {
				min = a; // �ּҰ� �˰���
				near = data[i]; // ���������� ����� ��
			}
		}

		//[3] Output
		System.out.println(target + "�� ����� �� : " + near);
	}

	/**
	 * ���밪 ���ϴ� �޼ҵ�
	 *
	 * �Ѱܹ��� num�� 0���� ������ -��ȣ�� �ٿ� +�� �ٲ۴�.
	 * ex) (-1 < 0) �̸� -(-1)�� �Ǿ� 1�� ���ȴ�.
	 *
	 * @param num
	 * @return
	 */
	public static int Abs(int num) {
		return (num < 0) ? -num : num;
	}
}
