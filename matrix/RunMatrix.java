import java.util.Scanner;

public class RunMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of your matrix: ");
		int input = scanner.nextInt();
		Matrix matrix = new Matrix(input);
		matrix.printDefault();
		matrix.populateMatrix();
		matrix.flipMatrix();
		matrix.printFlipped();
		scanner.close();
	}
}
