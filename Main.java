//imported scanner - as well as random 
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    //start here
    System.out.println("\nWelcome to 8 ball\n");
    boolean gameStart = true;

    while(gameStart = true) {
      String answerOne;
      Scanner scan = new Scanner(System.in);
      System.out.println("\nWhat is your yes/no question?\n");
      answerOne = scan.nextLine();

      //random used; cousin helped me

      Random rand = new Random();
      int value = rand.nextInt(4-1) + 1;

      //used numbers to correspond with yes no or maybe output

      if(value == 1) {
        System.out.print("\nYes\n");
      }
      else if(value == 2) {
        System.out.print("\nMaybe\n");
      }
      else if(value == 3) {
        System.out.print("\nNo\n");
      }

      //retry function

      System.out.println("\nPress 1 to go back to the main screen\n");
      String retry = scan.nextLine();
      String retryIs = "1";
      if(retry.equals(retryIs) && 0 == 0) {
        gameStart = false;
        gameStart = true;
      }
      else {
        System.out.print("\nI said press number one to go back, but whatever\n");
        gameStart = false;
        gameStart = true;
      }
    
    }
  }
}//end here