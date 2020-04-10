import java.util.Random;//�������� �߻���Ű�� ���ؼ�

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
		int[] data = new int[n];//����ִ� int�� �迭 ����
		Random rand = new Random();
		
		for(int i=0;i<n;i++) {
			data[i] = rand.nextInt(100);//���������� �����ϱ� ���� �޼ҵ�, nextInt�� �μ��� ������� ������ 0~�ִ� ���������� ������ �߻�. 0~99�� �߻�
		}
		
		long start = System.currentTimeMillis();
		Bubble.sort(data);//Bubble�̶�� Ŭ���� ���ο����� �ٷ� sort�޼ҵ带 ȣ���� �� ������
						  //�Ϲ������δ� static�޼ҵ�� Ŭ���� �̸� ������ �޼ҵ带 ȣ���ؾ���
		long end = System.currentTimeMillis();
		
//		for(int i = 0;i<data.length;i++) {
//			System.out.println(data[i]);
//		}
		
		double elapsed = (end - start)/1000.0; //start�� end�� �и��� ���������� 1000�� ������
		
		System.out.println(n + " => " + elapsed + "seconds");
	}

}
