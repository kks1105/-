package pro1028;

public class 배열array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] scores= {90,99,87};
for(int i=0;i<scores.length;i=i+1) {
System.out.println(scores[i]);}
//배열은 반복문을 이용해서 모든 데이터에 접근할수있기때문에
//처리하는 문장이 간결해집니다
for(int score :scores) 
{System.out.println(score);}
}
}
