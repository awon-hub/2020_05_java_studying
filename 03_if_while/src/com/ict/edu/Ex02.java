package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�.
		// ���� : if (���ǽ�){
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// } else {
		// ���ǽ��� �����϶� ���� ����;
		// ���ǽ��� �����϶� ���� ����;
		// }

		// int k2 60 �̻��̸� �հ�, 60�̸��� ���հ�
		int k1 = 78;
		String str = "";
		if (k1 >= 60) {
			str = "�հ�";
		} else {
			str = "���հ�";
		}
		System.out.println("��� : " + str);

		// Ȧ�� ¦�� �Ǻ�
		int k2 = 42;
		if (k2 % 2 == 0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}
		System.out.println("��� : " + str);

		// �빮��, �ҹ��� �Ǻ�
		char k3 = 'q';
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "�빮��";
		} else {
			str = "�ҹ���";
		}
		System.out.println("��� : " + str);

		// 1�Ǵ� 3�̸� ����. �ƴϸ� ����
		int k4 = 2;
		if (k4 == 1 || k4 == 3) {
			str = "����";
		} else {
			str = "����";
		}
		System.out.println("��� : " + str);

		// �ٹ��ð� 8590 ,�ʰ��� 1.5 �ٹ��ð� 10 ��?

		int time = 10;
		int dan = 8590;
		int pay = 0;

		if (time > 8) {
			pay = (int) (8 * dan + (dan * 1.5) * (time - 8));
		} else {
			pay = time * dan;
		}

		System.out.println("��� : " + pay + "��");

		// �� �� �� ū ���� ����Ͻÿ�
		int k5 = 42;
		int k6 = 56;
		int result = 0;
		if (k5 > k6) {
			result = k5;
		} else {
			result = k6;
		}
		System.out.println("��� : " + result);
	}
}