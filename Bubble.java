import java.util.Random;//정수난수 발생시키기 위해서

public class Bubble {
	public static void sort(int[] a) {
		int n = a.length;
		for (int i = n-1;i>0;i--) {
			for(int j=0; j<i;j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//int[] data = { 2, 9, 5, 4, 8, 1 }; //1
		int n = 100000;
		int[] data = new int[n];//비어있는 int형 배열 선언
		Random rand = new Random();
		
		for(int i=0;i<n;i++) {
			data[i] = rand.nextInt(100);//정수난수를 생성하기 위한 메소드, nextInt에 인수를 사용하지 않으면 0~최대 정수사이의 난수만 발생. 0~99만 발생
		}
		
		long start = System.currentTimeMillis();
		Bubble.sort(data);//Bubble이라는 클래스 내부에서는 바로 sort메소드를 호출할 수 있지만
						  //일반적으로는 static메소드는 클래스 이름 다음에 메소드를 호출해야함
		long end = System.currentTimeMillis();
		
//		for(int i = 0;i<data.length;i++) {
//			System.out.println(data[i]);
//		}
		
		double elapsed = (end - start)/1000.0; //start와 end는 밀리초 단위임으로 1000을 나눠줌
		
		System.out.println(n + " => " + elapsed + "seconds");
	}

}
