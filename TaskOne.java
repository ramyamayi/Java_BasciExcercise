
public class TaskOne {
	public static void main(String[] args) {
int num1 = 4;
int num2 = 5;
int temp;
System.out.println("Before swapping : " + num1 + " , "+ num2);

temp=num1;
num1 = num2;
num2=temp;
System.out.println("After swapping with temperory variable: " +num1 +" , "+ num2);

num1 =num1+num2;
num2 = num1-num2;
num1= num1-num2;
System.out.println("After swapping without temporart variable: " + num1 + " , "+ num2);
}
}
