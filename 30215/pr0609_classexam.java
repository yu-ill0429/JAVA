
public class pr0609_classexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student yee = new Student();
		Student lim = new Student();
		yee.name = "�̹ο�";
		yee.grade = 2;
		
		lim.name = "������";
		lim.grade = 3;
		System.out.println("�л��� �̸��� " + lim.name + "�̰�, " + lim.grade + "�г��Դϴ�.");
		System.out.println("�л��� �̸��� " + yee.name + "�̰�, " + yee.grade + "�г��Դϴ�.");
		
		lim.floor();
		yee.floor();

	}

}

class Student{
	String name;
	int grade;
	
		public void floor() {
	
			if(grade ==3) {
				System.out.println(grade + "�г��� 4���Դϴ�.");
			}
			else if(grade == 2) {
				System.out.println(grade + "�г��� 3���Դϴ�.");
			}
	
			else if(grade == 1){
				System.out.println(grade + "�г��� 2���Դϴ�.");
			}
	}
}
