package pro1028;

public class Practice2021102806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//prime(소수):1과자기자신으로만 나누어 떨어지는수
//소수 판별하는 방법:2부터자신의 절반이 되는 숫자까지 나누어서
		//한번도 나누어 떨어지지 않으면 소수
		
		int su =11;
		//su  가 소수 인지 확인하기
	boolean flag=true;
		for(int i =2;i<su/2+1;i=i+1)
		if(su%i==0) {		
		flag=false;
		break;}
		if(flag==true)
		{System.out.println("소수임");}
		else
		{System.out.println("소수아님");}
}
}
