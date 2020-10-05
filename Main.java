import java.util.Scanner;
/**
 * Asks user for positive integer, if the integer given is positive, it tells the user all the factors of their positive integer
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a new scanner to get the user's input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int number; //the number provided by the user
    int counter = 1; //the number that will increase every time the loop finishes
    int remainder; //the remainder of the number and the counter

    //get the user's number
    do{
      //ask user for positive number
      System.out.println("Please enter a positive integer to determine its factors:");
      //store the in number the variable
      number = input.nextInt();
    }while(number <= 0); //if the number is less than or equal to 0, ask them for another number
    
    //once a positive number has been given, tell the user the factors of the number
    System.out.println("The factors of " + number + " are:");

    //start a loop to check the remainder of all the numbers until it is at the users number
    while(counter <= number){ //if the counter is less than or equal to the number
      //find the remainder of the number and the counter, and store it in a variable
      remainder = number % counter;
      //if counter is a factor of the number, the remainder should be 0
      if(remainder == 0){
        //print that factor to the screen
        System.out.println(counter);
      }
      //increase counter by one
      counter = counter + 1;
    }
  }
}
