import java.util.Scanner;

public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int c,d;
		int sum = 0;
		System.out.println("ó������ �Է��ϼ���");
		c = a.nextInt();
		System.out.println("���������� �Է��ϼ���");
		d=a.nextInt();
		for(int i=c;i<=d;i++)
		{
			sum=sum+i;
		}
		System.out.println(c+"����"+d+"���� ���� ����"+sum+"�Դϴ�");
	}

}
