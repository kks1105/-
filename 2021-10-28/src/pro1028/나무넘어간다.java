package pro1028;

public class 나무넘어간다 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int man,wood;
for(man=0,wood=0;man<101;man=man+1,wood=wood+1) 
	//고쳐야함
{System.out.println("나무꾼이나무를"+man+"개	찍었다");
System.out.println("나무가"+(100-wood)+"남음");
if(wood==50) {System.out.println("반이사라짐");}
if(wood==100) {System.out.println("나무사라짐");}
}
}
}
