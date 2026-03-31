import java.util.Random;

public class Matrix {
  int size;
  int minInput = 1;
  int maxInput = size * size;
  Random random = new Random();

  public Matrix(int size){
    printDefault(size);
    populateMatrix(size);
  }

  public void populateMatrix(int size){
    this.size = size;
    int[][] matrix = new int[size][size];
    System.out.println();
    System.out.print("Populating matrix...");
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        int randNum = random.nextInt(1, (size^2));
        matrix[x][y] = randNum;
      }
    }
    System.out.println("Matrix populated");
    System.out.println();
    printMatrix(matrix);
  }

  public void printDefault(int size){
    int[][] matrix = new int[size][size];
    System.out.println("Your matrix is " + size + " x " + size);
    System.out.println();
    System.out.println("Printing matrix with default values");
    System.out.println();
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        System.out.print(matrix[x][y] + "   ");
      }
      System.out.println();
    }
  }

  public void printMatrix(int[][] matrix) {
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        System.out.print(matrix[x][y] + "   ");
      }
      System.out.println();
    }
  }
}
