
public class Ex19 {
	public static void main(String[] args) {
	// 삼항연산자 예제들
		// int k1가 홀수인지 짝수인지 판별하자
		

		int k1 = 18;
		String result = (k1%2==1) ? "홀수" : "짝수";
		System.out.println("결과 : " + result);
		
		// int k2가 60이상이면 합격, 아니면 불합격 판별하자
		int k2 = 56;
		result = (k2>=60) ? "합격" : "불합격";
		System.out.println("결과 : " + result);
		
		
		// char k3 = 대문자인지, 대문자가 아닌지 판별하자
		char k3 = 'g';
		result = (k3>='A'&& k3<='Z') ? "대문자" : "대문자아님";
		System.out.println("결과 : " + result);		
		
		
		
		// 근무시간이 8시간까지는 시간당 8590이고
		// 8시간을 초과한 시간 만큼은 1.5배를 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		
		int wh = 10;
		int result1 = (wh>8) ? (8590*8)+(int)((8590*1.5)*(wh-8)) : 8590*wh;
		System.out.println("결과 : " + result1+ "원");			
		
		
		//선생님 풀이
		
		int time = 10;
		int dan = 8590;
		int pay = (time>8) ? (int)((8*dan)+(time-8)*dan*1.5): time * dan;
		System.out.println("결과 : " + pay + "원");		
		
		
		
		
		
		
		
		
	}
}
