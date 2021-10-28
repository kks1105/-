package pro1028;

public class 인덱스변수이용해반복문완료확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//인덱스 변수를 이용해서 반복문이 끝까지 수행되었는지 확인
		int j=0;
		for(j=0;j<5;j=j+1) {
			if(j%4==1) 
			{break;}
			{System.out.println("반복문이마지막까지했는지확인");}
			if(j==5){System.out.println("반복문을 	끝까지수행");}
			else {System.out.println("반복문이중간에종료되었습니다");}
boolean f =true;
for(j=0;j<5;j=j+1) 
{if(j%4==10) 
	{f=false;
	break;}	{System.out.println("반복문이마지막까지했는지확인");}
	if(f==true) {System.out.println("중간에	반복문을멈추지않았음");}
	else {System.out.println("중간에 반복문을 중단했습니다.");}
	}
}
}
}

