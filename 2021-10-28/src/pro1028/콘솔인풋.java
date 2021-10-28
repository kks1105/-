package pro1028;

public class 콘솔인풋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//키보드로 입력받을 수있는 인스턴스 생성
		java.util.Scanner sc =
new java.util.Scanner(System.in);
//문자열 입력받기
		 System.out.print("이름을입력하세요:");
		String name = sc.nextLine();
		System.out.println("이름:"+name);
		
		//정수입력받기
		System.out.println("점수를입력하세요:");
		int score =sc.nextInt();
		System.out.println("점수:"+score);
		
		//문자열입력받기
		 System.out.print("별명을입력하세요:");
	//숫자입력받고문자라인을입력받을때에는nextLine을추가
		 sc.nextLine();
			String ni	=sc.nextLine();
			System.out.println("별명"+ni);
		
		sc.close();
		}
}
