package calcu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int optionMenu;
		int side1;
		int side2;

		do {
			System.out.println("\nWELCOME TO THIS FULL ODUAD'S CALCULATOR");
			System.out.println("1. Aritmetic Operations");
			System.out.println("2. Functions");
			System.out.println("3. Geometry");
			System.out.println("4. Vectors");
			System.out.println("5. Matrices");
			System.out.println("6. Polynomials");
			System.out.println("7. Complex Numbers");
			System.out.println("8. Statistics");
			System.out.println("9. Exit");
			optionMenu = Integer.parseInt(JOptionPane.showInputDialog("WELCOME TO THIS ODUAD'S FULL CALCULATOR\n"
					+ "1. Aritmetic Operations\n" + "2. Functions\n" + "3. Geometry\n" + "4. Vectors\n"
					+ "5. Matrices\n" + "6. Polynomials\n" + "7. Complex Numbers\n" + "8. Statistics\n" + "9. Exit\n"
					+ "Enter what you want to work with: "));

			switch (optionMenu) {
			case 1:
				JOptionPane.showMessageDialog(null, "You want to use aritmetic operations.");
				System.out.println("\nYou want to use aritmetic operations.\n");
				arithmeticOperations();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "You want to use functions.");
				System.out.println("\nYou want to use functions.");
				Functions();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "You want to see geometric properties.");
				System.out.println("\nYou want to see geometric properties.");
				poligons();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "You want to work with vectors.");
				System.out.println("\nYou want to work with vectors.");
				vectors();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "You want to work with matrices.");
				System.out.println("\nYou want to work with matrices.");
				matrices();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "You want to work with polynomials.");
				System.out.println("\nYou want to work with polynomials.");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "You want to work with complex numbers.");
				System.out.println("\nYou want to work with complex numbers.");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "You want to work with statistics.");
				System.out.println("\nYou want to work with statistics.");
				statistics();
				break;
			case 9:
				System.out.println("\nYou have chosen exit.");
				break;
			default:
				System.out.println("This option does not exist");
				break;
			}
		} while (optionMenu != 9);
	}

	public static void arithmeticOperations() {
		int optionArithmetic;
		double number1;
		double number2;
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Module");
			System.out.println("6. Exit");
			optionArithmetic = Integer
					.parseInt(JOptionPane.showInputDialog("1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n"
							+ "4. Division\n" + "5. Module\n" + "6. Exit\n" + "Enter what you want to do: "));

			switch (optionArithmetic) {
			case 1:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 + number2));
				JOptionPane.showMessageDialog(null, "The result is " + (number1 + number2));
				break;
			case 2:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 - number2));
				JOptionPane.showMessageDialog(null, "The result of the addition is " + (number1 - number2));
				break;
			case 3:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 * number2));
				JOptionPane.showMessageDialog(null, "The result of the multiplication is " + (number1 * number2));
				break;
			case 4:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 / number2));
				JOptionPane.showMessageDialog(null, "The result of division the is " + (number1 / number2));
				break;
			case 5:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 % number2));
				JOptionPane.showMessageDialog(null, "The module is " + (number1 % number2));
				break;
			case 6:
				break;
			default:
				JOptionPane.showInputDialog("This option does not exist.\n");
				break;
			}

		} while (optionArithmetic != 6);
	}

	public static void Functions() {
		int optionFunction;
		double number;
		double angle;
		double angleRadians;
		do {
			optionFunction = Integer.parseInt(JOptionPane.showInputDialog("1. Sine\n" + "2. Cosine\n" + "3. Tangent\n"
					+ "4. Cotangent\n" + "5. Secant\n" + "6. Cosecant\n" + "7. Logarith,\n" + "8. Natural Logarithm\n"
					+ "9. Exit\n" + "Enter what you want to use: "));

			switch (optionFunction) {
			case 1:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The sin is: " + (Math.sin(angleRadians)));
				JOptionPane.showMessageDialog(null, "The sin is " + (Math.sin(angleRadians)));
				break;
			case 2:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The cosine is: " + (Math.cos(angleRadians)));
				JOptionPane.showMessageDialog(null, "The cosine is " + (Math.cos(angleRadians)));
				break;
			case 3:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The tangent is: " + (Math.tan(angleRadians)));
				JOptionPane.showMessageDialog(null, "The tangent is " + (Math.tan(angleRadians)));
				break;
			case 4:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The cotangent is: " + (1 / Math.tan(angleRadians)));
				JOptionPane.showMessageDialog(null, "The cotangent is " + (1 / Math.tan(angleRadians)));
				break;
			case 5:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The secant is: " + (1 / Math.cos(angleRadians)));
				JOptionPane.showMessageDialog(null, "The secant is " + (1 / Math.cos(angleRadians)));
				break;
			case 6:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The cosecant is: " + (1 / Math.sin(angleRadians)));
				JOptionPane.showMessageDialog(null, "The cosecant is " + (1 / Math.sin(angleRadians)));
				break;
			case 7:
				number = Float.parseFloat(JOptionPane.showInputDialog("Enter the number: "));
				System.out.println("The logarithm is: " + (Math.log10(number)));
				JOptionPane.showMessageDialog(null, "The logarithm is " + (Math.log10(number)));
				break;
			case 8:
				number = Float.parseFloat(JOptionPane.showInputDialog("Enter the number: "));
				System.out.println("The natural logarithm is: " + (Math.log(number)));
				JOptionPane.showMessageDialog(null, "The natural logarithm is " + (Math.log(number)));
				break;
			case 9:
				break;
			default:
				JOptionPane.showInputDialog("This option does not exist.\n");
				break;
			}

		} while (optionFunction != 9);
	}

	public static void poligons() {
		double side;
		int optionPoligon;

		do {
			optionPoligon = Integer.parseInt(JOptionPane.showInputDialog("1. Quadrilaterals\n" + "2. Rectangles\n"
					+ "3. Triangle\n" + "4. Exit\n" + "Enter what you want to work with: "));

			switch (optionPoligon) {
			case 1:
				side = Float.parseFloat(JOptionPane.showInputDialog("Enter the side: "));
				Quadrilaterals sq1 = new Quadrilaterals(side);
				JOptionPane.showInputDialog("The perimeter is: " + sq1.perimeterS(side) + "u." + "\nThe area is: "
						+ sq1.areaS(side) + "u.u.");
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				break;
			default:
				JOptionPane.showInputDialog("This option does not exist.\n");
				break;
			}

		} while (optionPoligon != 4);
	}

	public static void vectors() {
		int vectorOption;
		int length1, length2;
		Vectors vector1, vector2;

		do {
			vectorOption = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Addition" + "\n2. Subtraction" + "\n3. Multiplication" + "\n4. Comparison" + "\n5. Dot product"
							+ "\n6. Cross product" + "\n7. Multiply by a scalar"+ "\n8. Exit" + "\nEnter the operation you want work with: "));
			switch (vectorOption) {
			case 1:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				length2 = insertVector2();
				vector2 = new Vectors(length2);
				vector2.fillVector(length2);
				break;
			case 2:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				length2 = insertVector2();
				vector2 = new Vectors(length2);
				vector2.fillVector(length2);
				break;
			case 3:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				length2 = insertVector2();
				vector2 = new Vectors(length2);
				vector2.fillVector(length2);
				break;
			case 4:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				length2 = insertVector2();
				vector2 = new Vectors(length2);
				vector2.fillVector(length2);
				break;
			case 5:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				length2 = insertVector2();
				vector2 = new Vectors(length2);
				vector2.fillVector(length2);
				break;
			case 6:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				length2 = insertVector2();
				vector2 = new Vectors(length2);
				vector2.fillVector(length2);
				break;
			case 7:
				length1 = insertVector1();
				vector1 = new Vectors(length1);
				vector1.fillVector(length1);
				break;
			case 8:
				break;
			default:
				break;
			}
		} while (vectorOption != 8);
	}

	public static void matrices() {
		int rows1;
		int columns1;
		int rows2;
		int columns2;
		int matrixOption;

		do {
			matrixOption = Integer
					.parseInt(JOptionPane.showInputDialog("1. Addition" + "\n2. Subtraction" + "\n3. Multiplication"
							+ "\n4. Comparison" + "\n5. Exit" + "\nEnter the operation you want work with: "));
			switch (matrixOption) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				break;

			default:
				break;
			}
		} while (matrixOption != 5);
		rows1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows of the first matrix: "));
		columns1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns of the first matrix: "));
		Matrices matrix1 = new Matrices(rows1, columns1);
		matrix1.fillMatrix(rows1, columns1);

		rows2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows of the second matrix: "));
		columns2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns of the second matrix: "));
		Matrices matrix2 = new Matrices(rows2, columns2);
		matrix2.fillMatrix(rows2, columns2);
	}

	public static void statistics() {
		//List<Double> numbers = new ArrayList<>();
		int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of data: "));
		double array[] = new double[size];
		double element=0;
		double sum = 0;
		double mean, median, mode;
		double range, variance, standardD, absoluteD;
		String str="";

			for (int i = 0; i < size; i++) {
				element = Double.parseDouble(JOptionPane.showInputDialog("Enter the element " + (i + 1) + ": "));
				array[i] = element;
				sum += element;
				str+=array[i]+" ";
			} //¿Cómo lo arranco con arrays?

		mean = sum/size;
		System.out.println("The elements were ["
				+ ""+str+"]");
		System.out.println("The sum of the elements is "+sum);
		System.out.println("Central tendency:");
		System.out.println("The mean is "+mean);
		System.out.println("The median is ");
		System.out.println("The mode is ");
		System.out.println("Dispersion: ");
		System.out.println("The range is: ");
		System.out.println("The variance is: ");
		System.out.println("The standard deviation is: ");
		System.out.println("Average absolute deviation is: ");
	}
	
	public static int insertVector1(){		
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the first vector: "));
		return number1; 
	}
	
	public static int insertVector2(){		
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the second vector: "));
		return number2; 
	}
}