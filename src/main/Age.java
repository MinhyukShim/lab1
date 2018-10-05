import java.util.Scanner;

public class Age
{
  public static void main(String[] args)
  {
    //creates a scanner which is used for inputs
    Scanner sinput = new Scanner(System.in);

    //asks user for age
    System.out.println("Enter your age:");

    //takes in the users input
    int age = sinput.nextInt();

    //doubles the age
    int doubleAge = age * 2;

    //outputs the doubled age
    System.out.println("How old? That's half way to " + doubleAge + "!");
  }
}
