
 class TriangleExam {

	public static void main(String[] args, double a, double b) {
		a= (double) 10.2;
		b=(double) 17.3;
	}
	public void chain(){
		 double a = (double) 7.5;
		 double b = (double) 9.2;
	}
	public void th(int b ) {
		
		int a;
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ´Â"+a*b*0.5);
	}
}
public class Triangle {      public static void main(String[] args) {         
	// TODO Auto-generated method stub        
	Triangle Triangle1 = new Triangle(10.2, 17.3);        
	System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ´Â "+Triangle1.area()+"cm^2 ÀÔ´Ï´Ù");         
	Triangle1.change(7.5, 9.2);        
	System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ´Â "+Triangle1.area()+"cm^2 ÀÔ´Ï´Ù");     }  
}  
class Triangler {    
	double width, height;         
	public Triangler(double a, double b) {       
		width=a;         height=b;     }         
	public void change(double c, double d) {       
		width=c;         height=d;     }          
	public double area() {       
		return (width*height)/2;     } }
