package week04;

import java.util.Scanner;

  

public class StudentsNamesMenuApp {
	 
static Scanner  scanner = new Scanner(System.in);
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int choice = 0;
		
		while(choice ! = -1) {
			
			showMenu();
			
			choice = getUserChoice();
		}
	}

	public static void showMenu () {
		System.out.println("1) Print Studnet Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("---------------------------------");
	}
	public static in getUserChoice() {
		return Scanner.nextInt();
		
	}
}
