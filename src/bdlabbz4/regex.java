package bdlabbz4;

import java.util.Scanner;
import java.util.regex.*;

public class regex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO USER REGISTRATION PROGRAM");
        //uc1:user first name starts with capital letter and have minimum 3-character
        System.out.print("Enter first name: ");
        String firstName = scan.nextLine();
        
      //uc2:user last name starts with capital letter and have minimum 3-character
        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();
        

        // Define regex patterns for validation
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        
        // Compile the regex patterns
        Pattern namePattern = Pattern.compile(nameRegex);

        // Match the input credentials against the regex patterns
        Matcher firstNameMatcher = namePattern.matcher(firstName);
        Matcher lastNameMatcher = namePattern.matcher(lastName);

        // Check if the credentials match the required patterns
        if (firstNameMatcher.matches() && lastNameMatcher.matches() ) {
            System.out.println("Valid credentials. field meets the requirements.");
        } else {
            if (!firstNameMatcher.matches()) {
                System.out.println("Invalid first name. It should start with a capital letter and have a minimum of 3 characters.");
            }
            if (!lastNameMatcher.matches()) {
                System.out.println("Invalid last name. It should start with a capital letter and have a minimum of 3 characters.");
            }
        }
	}
}