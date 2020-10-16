
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    //start here
    int answerOne;
    Scanner scan = new Scanner(System.in);
    System.out.println("\nWelcome to 8 ball\n\n");
    System.out.println("What is your yes/no question?\n");
    answerOne = scan.nextInt();
    Random rand = new Random();
    int value = rand.nextInt(3-1) + 1;
    if(value == 1) {
      System.out.print("Yes");
    }
    else if(value == 2) {
      System.out.print("Maybe");
    }
    else if(value == 3) {
      System.out.print("No");
    }
    //end here
  }
}