import java.util.Scanner;

public class pr0604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("�Ƶ� ��:");
		a = sc1.nextInt();
		System.out.println("���� ��:");
		b = sc2.nextInt();
		
		System.out.println("�� ����:"+(a+b));
		System.out.println("�ݾ�"+(6000*a+8000*b));

	}

}
