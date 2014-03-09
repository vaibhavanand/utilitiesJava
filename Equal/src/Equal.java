import java.util.Scanner;
public class Equal {

	public static void main(String [] args ) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		System.out.print("enter 1st: ");
		number1  = input.nextInt(); // hi my name is 12
		System.out.print("enter 2nd: ");
		number2  =  input.nextInt();
		
		if (number1 == number2){
			System.out.printf("%d == %d\n" ,number1,number2);
		}
		
		if (number1 != number2){
			System.out.printf( "%d != %d\n",number1,number2);
		}
		
		if (number1 < number2){
			System.out.printf("%d < %d\n",number1,number2);
		}
		if (number1 > number2){
			System.out.printf("%d > %d\n",number1,number2);
		}
	}

}
