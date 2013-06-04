package com.soris.study.algorithm;

/**
 * �־��� ���� �߿��� �󵵼��� ���� �� ���ϱ�
 * �ֺ�(MODE) : ���� ���� ��Ÿ�� �� -> �������� �ε����� ī��Ʈ(count) ���� �ִ밪(Max)
 * @author �̼�
 * @since 2013. 6. 4.
 */
public class Mode {
	public static void main(String[] args) {
		//[1] �Է� : ���� = 0���� 5������ ���� ���´ٴ� ����
		int[] data = {1, 3, 4, 3, 5};
		int mode = 0;
		int[] index = new int[6]; // 0~5���� : �ε����� ī����
		int max = Integer.MIN_VALUE; // �ִ밪�� �����ϱ� ���� ����; �ʱⰪ�� �������� �ּҰ� ����

		//[2]
		/**
		 * data �迭�� �ִ� ������ (1, 3, 4, 3, 5) index�迭�� �ε����� ���Ǿ� ī��Ʈ �ȴ�.
		 * ī��Ʈ �Ǿ� index�� ����� ���� �߿��� �ִ밪�� ���ϴ°� ����Ʈ.
		 * �ִ밪�� ������ �ִ� index�� �ε����� �ֺ��� �ǰ�, �� �ε����� ����� ���� �ݺ��� ���̴�.
		 */
		for (int i = 0; i < data.length; i++) {
			index[data[i]]++; // count
		}

		for (int i = 0; i < index.length; i++) {
			if(max < index[i]) {
				max = index[i]; // MAX
				mode = i; // �ֺ� MODE
			}
		}

		System.out.println("�ֺ� : " + mode + " , " + max +"��");
	}
}
