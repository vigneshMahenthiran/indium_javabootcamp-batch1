package methodsDemo;

public class MethodsDemo {

	public static void main(String[] args) {
		System.out.println("Main method called");
		printDetail();
		printDetailWithArg("method with arguments");
		System.out.println(count(5,6));

	}
	
	public static void printDetail() {
		System.out.println("welcome to methods demo");
	}
	
	public static void printDetailWithArg(String msg) {
		System.out.println((msg));
	}
	
	public static String getMessage() {
		return "getting string";
	}
	
	public static int count(int a , int b) {
		return (a+b);
	}
}
