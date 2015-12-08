import java.util.Scanner;

public class ExerciseTriangleArea {

	/*
	 * Да се състави програма, която по въведени три числа – страни на
	 * триъгълник, отпечатва лицето на този триъгълник и неговия периметър.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first side: ");
		double sideA = input.nextDouble();
		System.out.print("Enter second side: ");
		double sideB = input.nextDouble();
		System.out.print("Enter third side: ");
		double sideC = input.nextDouble();

		System.out.println(triangleArea(sideA, sideB, sideC));
		System.out.println(trianglePerimeter(sideA, sideB, sideC));

	}

	public static double trianglePerimeter(double sideA, double sideB, double sideC) {
		double perimeter = sideA + sideB + sideC;

		return perimeter;

	}

	public static double triangleArea(double sideA, double sideB, double sideC) {
		double area = (sideB * sideC) / 2;
		return area;
	}

}
