
/**
* HelloApp - UC4 - A simple Java application that greets multiple users by name if
* provided as command-line arguments, or defaults to greeting "World" if no names are given
*
* Greet Multiple Users - The application should accept multiple names as command-line
* argumentsand display a personalized greeting for each user.
* Usage: java HelloAppUC4 [name1] [name2] ... [nameN]
* - If names are provided, it will display "Hello, [Namel], [Name2], ...! " to the console
* - If no names are provided, it will display "Hello, World!"
*
* @author Collins
* @version 4.0
* @since UC1
*/

// Key Concepts for HelloAppUC4:
// 1. Default Values: Providing a fallback value when no input is given
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Boolean Logic: Using logical conditions to control flow
// 5. Array Length: Checking the number of command-line arguments
// 6. StringBuilder: Efficiently building a string from multiple parts
// 7. Looping Constructs: Using for loops to iterate through command-line arguments
// 8. String Concatenation: Joining multiple strings with a delimiter (comma and space)
// 

public class HelloApp{
    public static void main(String[] args) {
        // Check if any names are provided as command-line arguments
        if (args.length > 0) {
            // Use StringBuilder to efficiently build the greeting message
            StringBuilder newBuilder = new StringBuilder("Hello, ");
            for (int i = 0; i < args.length; i++) {
                newBuilder.append(args[i]);
                if (i < args.length - 1) {
                    newBuilder.append(", "); // Add a comma and space between names
                }
            }
            newBuilder.append("!"); // Add an exclamation mark at the end
            System.out.println(newBuilder.toString()); // Print the personalized greeting
        } else {
            // If no names are provided, greet "World"
            System.out.println("Hello, World!");
        }
    }

}