import java.util.Scanner;
public class RunCalculator {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int choice;
		int op1, op2;
		System.out.println("Please enter initial integer value to be operated on");
		op1 = input.nextInt();
		do
		{
			System.out.println("Please enter the function you would like to perform");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exponent");
			System.out.println("6. Factorial");
			System.out.println("7. Quit");
			choice = input.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Please enter the value you would like to add to "+ op1);
				op2 = input.nextInt();
				op1 = Calculator.add(op1, op2);
				System.out.println("Result is " + op1);
			}
			else if(choice == 2)
			{
				System.out.println("Please enter the value you would like to subtract from "+ op1);
				op2 = input.nextInt();
				op1 = Calculator.subtract(op1, op2);
				System.out.println("Result is " + op1);
			}
			else if(choice == 3)
			{
				System.out.println("Please enter the value you would like to multiply by "+ op1);
				op2 = input.nextInt();
				op1 = Calculator.multiply(op1, op2);
				System.out.println("Result is " + op1);
			}
			else if(choice == 4)
			{
				System.out.println("Please enter the value you would like to divide from "+ op1);
				op2 = input.nextInt();
				op1 = Calculator.divide(op1, op2);
				System.out.println("Result is " + op1);
			}
			else if(choice == 5)
			{
				System.out.println("Please enter the value you would like to raise "+ op1 + " to");
				op2 = input.nextInt();
				op1 = Calculator.exponent(op1, op2);
				System.out.println("Result is " + op1);
			}
			else if(choice == 6)
			{
				System.out.println("Taking factorial of "+ op1);
				op1 = Calculator.factorial(op1);
				System.out.println("Result is " + op1);
			}
			else if(choice != 7)
			{
				System.out.println("Entered invalid option, please try again.");
			}
		}while(choice != 7);
		System.out.println("Goodbye!");
	}
}