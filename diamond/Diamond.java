import java.util.Scanner;

public class Diamond {
	private static boolean isEven = false;
	private static int numSpaces;
	private static String spaces;
	private static String stars;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		int size = scanner.nextInt();
		printStar(size);
		scanner.close();
	}

	public static void printStar(int size){
		getVars(size);
		if (!isEven){
				for (int linesToPrintT = numSpaces; linesToPrintT > 0; linesToPrintT--){
					System.out.print(spaces);
					System.out.print(stars);
					System.out.println();
					spaces = spaces.substring(0, spaces.length() - 1);
					stars+="**";
				}
				for (int linesToPrintB = (numSpaces+1); linesToPrintB > 0; linesToPrintB--){
					System.out.print(spaces);
					System.out.print(stars);
					System.out.println();
					if (stars.length() > 1){
						stars = stars.substring(0, stars.length() - 2);
					}
					spaces+= " ";
				}
		}
		else {
			for (int linesToPrintT = (size/2); linesToPrintT > 0; linesToPrintT--){
				System.out.print(spaces);
				System.out.print(stars);
				System.out.println();
				if (spaces.length() > 2){
					spaces = spaces.substring(0, spaces.length() - 2);
				}
				stars += "* * ";
			}
			for (int linesToPrintB = (size/2) + 1; linesToPrintB > 0; linesToPrintB--){
				System.out.print(spaces);
				System.out.print(stars);
				System.out.println();
				if (stars.length() >= 4){
					stars = stars.substring(0, stars.length() - 4);
				} else if (stars.length() > 2){
					stars = stars.substring(0, stars.length() - 2);
				}
				spaces += "  ";
			}
		}
	}
	public static void getVars(int size){
		if (size % 2 == 0){isEven = true;}
		if (!isEven){
			numSpaces = (size-1)/2;
			spaces = " ";
			stars = "*";
		} else {
			numSpaces = size-1;
			spaces = "   ";
			stars = "* ";
		}
		for (int s = numSpaces; s > 0; s--){
			spaces += " ";
		}
	}
}
