import java.util.Scanner;
public class YUILL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sung = new Scanner(System.in);
		Scanner  ai = new Scanner(System.in);
		int tiketPrice = 8000, price=0;
		int chong;
		int gm;
		
		System.out.print("�Ƶ���:");
		int dong = ai.nextInt();
		
		System.out.print("���μ�:");
		int u = sung.nextInt();
		
		chong = dong+u;
		
		System.out.println("�Ѽ���:"+chong);
		
		gm = dong*(tiketPrice-2000) + (u*tiketPrice);
		
		System.out.print("�ݾ�:"+gm);
		
	}

}
