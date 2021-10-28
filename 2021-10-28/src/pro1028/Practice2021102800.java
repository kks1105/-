package pro1028;

public class Practice2021102800 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//heel word 를3번출력
		int i=0;
		while(i<3) {
			System.out.println("heel word"+i);
			i=i+1;

		}
		System.out.println("========");

		//for를 이용해서 동일한 내용을작성
		for(int j=0;j<3;j=j+1) {
			System.out.println("heel word"+j);
		}
		//image1.png,image2.png,image3.png를for를이용해서출력
		//for에서 첫번째 문장에서 변수를 반드시 생성할 필요가없음
		//기존의 변수 재사용가능
		for(i=0;i<3;i=i+1) {
			System.out.println("image"+i+".png");}
		//제어문 안에서 만든 변수는 제어문 바깥에서 사용할 수없음
	}
}


