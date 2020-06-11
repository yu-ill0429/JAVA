import java.util.Scanner;

public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int c,d;
		int sum = 0;
		System.out.println("처음수를 입력하세요");
		c = a.nextInt();
		System.out.println("마지막수를 입력하세요");
		d=a.nextInt();
		for(int i=c;i<=d;i++)
		{
			sum=sum+i;
		}
		System.out.println(c+"부터"+d+"까지 더한 값은"+sum+"입니다");
	}

}
