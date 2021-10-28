package pro1028;

public class for2021102802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for에서2개의 실행문을()안에서작성할때는,로구분
		int i, j;
		for(i=0,j=0; i<3;i=i+1,j=j+1) 
		{System.out.println("f0R"+(i+1)+j);}
		//()안의 내용을 생략하면 무한 반복되거나 한번도 수행되지 않습니다.
		//k가 처음에 거짓이 되서 한번도 수행되지 않음
		for(;;){
			System.out.println("무한반복");
		}
	}
}

