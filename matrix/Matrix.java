public class Matrix {
  int size;
  int minInput = 1;
  int[][] matrix;

  public Matrix(int size){
    this.size = size;
    this.matrix = new int[size][size];
  }

  public void populateMatrix(){
    System.out.println();
    System.out.print("Populating matrix...");
    int currVal = 0;
    for (int x = 0; x < size; x++) {
      for (int y = 0; y < size; y++) {
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
    for (int x = 0; x < size; x++) {
      for (int y = 0; y < size; y++) {
        if (x + y == size - 1) {
          System.out.print("\u001B[33m" + matrix[x][y] + "\u001B[0m");
          if (matrix[x][y] >= 10){
            System.out.print("   ");
          } else{
            System.out.print("    ");
          }
        } else {
          System.out.print(matrix[x][y]);
          if (matrix[x][y] >= 10){
            System.out.print("   ");
          } else{
            System.out.print("    ");
          }
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public void printFlipped(){
    System.out.println("Printing flipped matrix");
    for (int x = 0; x < size; x++){
      for (int y = 0; y < size; y++){
        if (x + y == size - 1) {
          System.out.print("\u001B[33m" + matrix[x][y] + "\u001B[0m");
          if (matrix[x][y] >= 10){
            System.out.print("   ");
          } else{
            System.out.print("    ");
          }
        } else {
          System.out.print(matrix[x][y]);
          if (matrix[x][y] >= 10){
            System.out.print("   ");
          } else{
            System.out.print("    ");
          }
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public void flipMatrix() {
    for (int x = 0; x < Math.ceil((double)size/2); x++) {
      for (int y = 0; y < size; y++) {
        if (x + y != size - 1) {
          int newX = size - 1 - x;
          int newY = size - 1 - y;
          swap(x, y, newX, newY);
        }
      }
    }
  }

  private void swap(int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }
}
