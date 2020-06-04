import java.util.*;
public class Arryer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
		Scanner su = new Scanner(System.in); 
		int max = arr[0];
		
		for (int i = 1; i < 6; i++) {
			System.out.println(i+"번 입력");
			arr[i] = su.nextInt();
		}
		for(int i=1 ; i<arr.length ; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
	}
		System.out.println("가장큰수는"+"번째"+ max);

}
}
