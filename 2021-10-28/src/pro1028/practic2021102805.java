package pro1028;

public class practic2021102805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2가지상태번갈아가면서10번수행하기
		boolean flag = true;
		for(int i=0;i<10;i=i+1) {
			try 
			{Thread.sleep(3000);}
			catch(Exception e) {}
			if(flag==true) {System.out.println("청기");
			}else {System.out.println("백기");
			}flag = !flag;
		}
	}

}
