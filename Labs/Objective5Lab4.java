import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    int num;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Pleas enter a number: ");
    num = scanner.nextInt();

    if(num % 2 == 0) {
        System.out.println("The number is even");
    }

    else if(num % 2 != 0) {
      System.out.println("The number is odd");
    }
  }
}
