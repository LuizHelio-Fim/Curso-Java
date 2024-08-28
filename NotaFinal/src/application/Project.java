package application;

import java.util.Scanner;
import entities.Studant;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Studant studant = new Studant();
		
		System.out.println("Enter your name and yours grades: ");
		studant.name = sc.nextLine();
		studant.grade1 = sc.nextDouble();
		studant.grade2 = sc.nextDouble();
		studant.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", studant.finalGrade()));
		
		if(studant.missingPoints() == 0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED\nMISSING "
								+ String.format("%.2f", studant.missingPoints()) 
								+ " Points");
		}
		sc.close();
	}

}
