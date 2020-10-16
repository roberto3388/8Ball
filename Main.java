
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    //start here
    System.out.println("\nWelcome to 8 ball\n\n");
    boolean gameStart = true;

    while(gameStart = true) {
      String answerOne;
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your yes/no question?\n");
      answerOne = scan.nextLine();
      Random rand = new Random();
      int value = rand.nextInt(3-1) + 1;
      if(value == 1) {
        System.out.print("\nYes\n");
      }
      else if(value == 2) {
        System.out.print("\nMaybe\n");
      }
      else if(value == 3) {
        System.out.print("\nNo\n");
      }
      System.out.println("\nPress 1 to go back to the main screen");
      String retry = scan.nextLine();
      String retryIs = "1";
      if(retry.equals(retryIs)) {
        gameStart = false;
        gameStart = true;
      }
    //end here
    }
  }
}