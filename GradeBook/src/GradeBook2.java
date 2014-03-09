import java.util.Scanner;
public class GradeBook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter name: ");
		 String courseName=input.nextLine();
		
		GradeBook gb=new GradeBook();
		gb.vaibhavhello(courseName);
		
	}

}
