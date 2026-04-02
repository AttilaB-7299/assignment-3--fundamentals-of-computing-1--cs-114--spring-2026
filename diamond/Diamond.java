import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number: ");
    int length = scanner.nextInt();
    int height = length;
    printStar(length);
    }

    public static void printStar(int size){
      if (size % 2 != 0){
        int numSpaces = (size-1)/2;
        String spaces = " ";
          for (int l = numSpaces; l > 0; l--){
            spaces += " ";
          }
          String stars = "*";
          for (int k = numSpaces; k > 0; k--){
            System.out.print(spaces);
            System.out.print(stars);
            System.out.println();
            spaces = spaces.substring(0, spaces.length() - 1);
            stars+="**";
          }
          for (int j = (numSpaces+1); j > 0; j--){
            System.out.print(spaces);
            System.out.print(stars);
            System.out.println();
            if (stars.length() > 1){
              stars = stars.substring(0, stars.length() - 2);
            }
            spaces+= " ";
          }
      } else {
        // System.out.println("ERROR 404 CODE NOT FOUND");
        int numSpaces = size-1;
        String spaces = "";
        String stars = "* ";
        for (int h = 0; h < numSpaces; h++){
          spaces += " ";
        }
        for (int k = ((size/2)-1); k > 0; k--){
          if (k == (size/2)-2){
            spaces += " ";
            System.out.print(spaces);
          } else {
            System.out.print(spaces);
          }
          System.out.print(stars);
          System.out.println();
          if (spaces.length() > 2){
            spaces = spaces.substring(0, spaces.length() - 2);
          }
          if (stars.length() != 2){
            stars+= "* * ";
          } else {
            stars += "* ";
          }

        }
        for (int j = (size); j > 0; j--){
          System.out.print(spaces);
          System.out.print(stars);
          System.out.println();
          if (stars.length() > 1){
            stars = stars.substring(0, stars.length() - 2);
          }
          spaces += " ";
        }
      }
  }
}
