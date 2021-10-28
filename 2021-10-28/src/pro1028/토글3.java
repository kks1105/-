package pro1028;

public class 토글3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오미크론,라투,다크스텍터 를 순서 대로 출력
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			if(i%5==0) {
				System.out.println("오미크론");
			}else if(i%5==1 ) {
				System.out.println("라투");
			}else if(i%5==2 ) {
				System.out.println("다크스펙터");
			}else if(i%5==3 ) {
				System.out.println("오미크론");
			}else if(i%5==4 ) {
				System.out.println("다크스펙터");
			}else if(i%5==5) {
				System.out.println("??");
			}
		}
	}
}


