
public class Ex18 {
	public static void main(String[] args) {
		//���׿�����(���ǿ�����)
		// ���� : ���庯�� = ���ǽ� ? �� �϶� ���� ���� : ������ �� ���� ����;
		//���ǽĿ� ���� ���� ; boolean�� -> �񱳿���,��������, boolean
		//���庯��, ���϶� ���� ���, ������ �� ���� ��� ��� ���� �ڷ���.
		
		String res = true ? "�հ�" : "���հ�";
		System.out.println("��� : " + res);
		
		//Error! 
		//res = false ? 10 : "b";
		
		//���ܻ���
		int point1 = true ? 10 : 20;
		long point2 = true ? 10 : 20;
		double point3 = true ? 10 : 24.7;

		//����� 90�� �̻��̸� 'A', �ƴϸ� 'B' ����
		
		double avg = 87.6;
		int result =  (avg>=90) ? 'A':'B';
		//avg=90�� true or false�� ����.
		
		System.out.println("��� : " +result);
		System.out.println("��� : " +(char)(result)); //����ȯ
		
		
	}
}