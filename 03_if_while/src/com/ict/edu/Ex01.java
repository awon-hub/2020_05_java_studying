package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// �ܼ� if : ���ǽ��� ���϶��� ����, ������ ���� if�� ����
		// ���ǽ� : boolean, �񱳿���, ��������
		// ���� : if (���ǽ�) {
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// }
		// ��, ���๮���� �� �� �� ���� {} ���� ����

		// int k1 >60 �̻��̸� �հ�.

		int k1 = 59;
		String str = "�ʱⰪ";
		if (k1 >= 60) {
			str = "�հ�";
		}
		System.out.println("��� : " + str);
		// �����̸� "�ʱⰪ" �̶�� ����.
		// �׳� �����ع���.

		// int k2 >60 �̻��̸� �հ�, 60�̸��� ���հ�

		int k2 = 59;
		str = "�ʱⰪ";
		if (k2 >= 60) {
			str = "�հ�";
		}
		if (k2 < 60) {
			str = "���հ�";
		}
		System.out.println("��� : " + str);

		// �̷��� �Ⱦ�

		int k3 = 59;
		str = "���հ�";
		if (k3 >= 60) {
			str = "�հ�";
		}
		System.out.println("��� : " + str);

		// ���ʿ� �������� ���հ����� �س���.

		// Ȧ�� ¦�� �Ǻ�
		int k4 = 7;
		str = "Ȧ��";
		if (k4 % 2 == 0) {
			str = "¦��";
		}
		System.out.println("��� : " + str);

		// �빮��, �ҹ��� �Ǻ�
		char k5 = 'G';
		str = "�빮��";
		if (k5 >= 'a' && k5 <= 'z') {
			str = "�ҹ���";
		}
		System.out.println("��� : " + str);

		// 1�Ǵ� 3�̸� ����. �ƴϸ� ����

		int k6 = 1;
		str = "����";
		if (k6 == 1 || k6 == 3) {
			str = "����";
		}
		System.out.println("��� : " + str);

		// �ٹ��ð� 8590 ,�ʰ��� 1.5 �ٹ��ð� 10 ��?/

		int time = 10;
		int dan = 8590;
		int pay = time*dan;

		if (time > 8) {
			pay = (int) (8 * dan + (dan * 1.5) * (time - 8));
		}
		System.out.println("��� : " + pay + "��");

		// �� �� �� ū ���� ����Ͻÿ�
		int k7 = 10;
		int k8 = 15;
		int result = 0;
		
		if (k7>k8) 
			System.out.println("��� : " + k7 );
		
		if (k7<k8) 
			System.out.println("��� : " + k8);	
	
	
		// Ǯ�� �� �� �� ū ���� ����Ͻÿ�
		int k9 = 10;
		int k10 = 15;
		int result1 = k10;
		
		if (k9>k10) {
			result1 = k9;
		}
			System.out.println("��� : " + result1);
			
	
	
	
	
	
	}
}