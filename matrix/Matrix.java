public class Matrix {
  int size;
  int minInput = 1;
  int[][] matrix;

  public Matrix(int size){
    this.size = size;
    this.matrix = new int[size][size];
    printDefault();
    populateMatrix();
    printFlipped();
  }

  public void populateMatrix(){
    System.out.println();
    System.out.print("Populating matrix...");
    int currVal = 0;
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        currVal++;
        matrix[x][y] = currVal;
      }
    }
    System.out.println("Matrix populated");
    System.out.println();
    printMatrix();
    System.out.println();
  }

  public void printDefault(){
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

  public void printMatrix() {
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        if (matrix[x][y] >= 10){
          System.out.print(matrix[x][y] + "   ");
        } else{
          System.out.print(matrix[x][y] + "    ");
        }
      }
      System.out.println();
    }
  }

  public void printFlipped(){
    System.out.println("Printing flipped matrix");
    flip();
  }

  public void flip(){
    for (int y = 0; y < size; y++){
      for (int x = 0; x < size; x++){
        int temp = matrix[x][y];
        matrix[x][y] = matrix[y][x];
        matrix[y][x] = temp;
        if (matrix[x][y] >= 10){
          System.out.print(matrix[x][y] + "   ");
        } else{
          System.out.print(matrix[x][y] + "    ");
        }
      }
      System.out.println();
    }
  }
}
