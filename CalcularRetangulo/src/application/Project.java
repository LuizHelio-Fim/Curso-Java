package application;

import java.util.Scanner;
import entities.Rectangle;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.println(rectangle);
		
		sc.close();
	}

}
