
import java.util.Scanner;

public class MathX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		output(sum(insert(), 0));
		output(tenth(input()));
		output((insert2()));
	
	}
	public static int sum (int x, int y)
	{
		return x+y;
	}
	public static int insert() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter a number X");
		int x = keyboard.nextInt();
		System.out.println("Enter a number Y");
		int y = keyboard.nextInt();
		return x + y;
	}

	public static int tenth(int x) {
		return x*x*x*x*x*x*x*x*x*x;
	}
	
	public static void output(double d) {
		System.out.println(d);
	}
	
	public static int input () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number ");
		return keyboard.nextInt();
		
	}
	
	public static double insert2()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter a number X");
		double x = keyboard.nextDouble();
		System.out.println(" Enter a number Y");
		double y = keyboard.nextDouble();
		System.out.println(" Enter a number Z");
		double z = keyboard.nextDouble();
		return  ((Math.sqrt(x)) + (Math.abs(y)) + Math.pow(z,  y));
		
	}
}

