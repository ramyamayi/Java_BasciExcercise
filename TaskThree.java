import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number between 1 and 10");

		int num1 = sc.nextInt();

		System.out.println("Enter second number between 1 and 10");

		int num2 = sc.nextInt();

		int z = num1 + num2;
		System.out.println("Sum of two numbers is: " + z);
		z = z + 30;
		System.out.println("Final result is :" + z);

	}

}
