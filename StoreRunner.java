import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    ChipotleFood entree1 = new ChipotleFood();

    ChipotleFood entree2 = new ChipotleFood("Burrito Bowl", 12.49, true);

    System.out.println(entree2);
    System.out.println();
    
    // Closes the Scanner object
    input.close();
    
  }
}