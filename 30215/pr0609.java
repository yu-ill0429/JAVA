import java.util.Scanner;

public class pr0609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "�� �Է�:");
			arr[1] = in.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				j = i + 1;
			}
		}
		System.out.println("���� ū ����" + j + "ù ��° ������ " + max);

	}

}
