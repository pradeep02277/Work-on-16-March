package java_practice;
//how to call static methods a class from a method in the same class
public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Pradeep");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}