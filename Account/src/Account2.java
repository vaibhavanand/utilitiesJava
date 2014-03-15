import  java.util.Scanner;

public class Account2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account money= new Account(50);
		
		System.out.printf("account balance is : %s\n", money.getBalance());
		
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		System.out.println("enter the deposit amount");
		depositAmount =input.nextDouble();
		System.out.printf("adding $%.2f to balance", depositAmount);
		money.credit(depositAmount);// ?????
		System.out.printf("\namount balance is : $%.5f", money.getBalance());
		
	}

}
