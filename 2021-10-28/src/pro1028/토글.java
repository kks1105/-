package pro1028;

public class 토글 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3초마다2가지동작을 번갈아 가면서 10번하기
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
			if(i%2==0) {
				System.out.println("on");
			}else {System.out.println("off");
			}
		}
	}
	}


