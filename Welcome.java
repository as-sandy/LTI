  public class Welcome {
  public static void main(String[] args) {
    // Get User Input
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");

    while (sc.hasNextLine()) { // here is the difference in the code
        // User Input Variable
        String name = sc.nextLine();
        if (name == null || name.trim().isEmpty()) {
            // Error for empty input, keep asking for valid input
            System.out.print("Please, what is your name?\n");
            sc.hasNextLine(); // here is the difference in the code
        } else {
            // Print name
            System.out.println("Hello " + name + "!");
            break;
        } // End of conditional
    } // End of while loop
     System.out.println("Happy Brthday Shree - With love dhiya");
  }
  }
