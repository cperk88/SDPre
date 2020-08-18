public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for(int i = 0; i < 20; i++) {
      System.out.print(counter);

      if(counter % 2 == 0) {
        System.out.println(" is even");
      }

      else if(counter % 2 != 0) {
        System.out.println(" is odd");
      }

      counter++;
    }
  }
}
