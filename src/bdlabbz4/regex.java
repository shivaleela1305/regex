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
        
        //uc3:user email has the @gmail.com 
        System.out.println("Enter email: ");
        String email = scan.nextLine();
        
        //uc4:user phone  number with +and country code along with 10-digits number
        System.out.println("Enter phone number: ");
        String phoneNumber = scan.nextLine();
        
        //uc5:user valid password with 8 character
        //uc6:password having atleast one uppercase character
        System.out.println("Enter password: ");
        String password = scan.nextLine();

        // Define regex patterns for validation
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        String emailRegex = "^[A-Za-z0-9+_.-]+@gmail\\.com$";
        String phoneRegex = "^\\+[0-9]{1,3}[0-9]{10}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z\\d])[A-Za-z\\d]{8,}$";
        
        // Compile the regex patterns
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        
        // Match the input credentials against the regex patterns
        Matcher firstNameMatcher = namePattern.matcher(firstName);
        Matcher lastNameMatcher = namePattern.matcher(lastName);
        Matcher emailMatcher = emailPattern.matcher(email);
        Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        
        // Check if the credentials match the required patterns
        if (firstNameMatcher.matches() && lastNameMatcher.matches() && emailMatcher.matches() && phoneMatcher.matches()  && passwordMatcher.matches()) {
            System.out.println("Valid credentials. field meets the requirements.");
        } else {
            if (!firstNameMatcher.matches()) {
                System.out.println("Invalid first name. It should start with a capital letter and have a minimum of 3 characters.");
            }
            if (!lastNameMatcher.matches()) {
                System.out.println("Invalid last name. It should start with a capital letter and have a minimum of 3 characters.");
            }
            if (!emailMatcher.matches()) {
                System.out.println("Invalid email address. Email should be of the format user@gmail.com.");
            }
            if (!phoneMatcher.matches()) {
                System.out.println("Invalid phone number. It should start with a '+' followed by a country code and then a 10-digit number.");
            }
            if (!passwordMatcher.matches()) {
                System.out.println("Invalid password. It should meet the specified requirements.");
            }
        }
	}
}