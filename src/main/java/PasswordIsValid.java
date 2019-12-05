
    import java.util.Scanner;

    public class PasswordIsValid {

        // Password Validqator run method
            public static void main (String[] args) {
                String rerun;
               do {
                   System.out.println("PASSWORD VALIDATOR");
                   System.out.println("Password should be longer than than 8 characters\n" +
                           "Password should have at least one lowercase letter\n" +
                           "Password should have at least one uppercase letter\n" +
                           "Password should at least have one digit\n" +
                           "Password should have at least one special character\n");
                   System.out.println("Please enter password :");
                   Scanner input = new Scanner(System.in);
                   String password = input.nextLine();
                   passwordCheck(password);
                   passWordIsOK(password);
                   System.out.println("Type 'Yes' to Run Again or 'No' to Exit  ");
                   rerun=input.nextLine();

               }while (rerun.equalsIgnoreCase("Yes"));
            }
        // Method That check if the password that meets all 6 conditions
            public static  void passwordCheck(String password) {

                String lowerCaseChars = "(.*[a-z].*)";
                String numbers = "(.*[0-9].*)";
                String specialCharacter = "(.*[a-zA-Z0-9].*)";
                String upperCaseChars = "(.*[A-Z].*)";

                if (password.isEmpty()){
                  System.out.println("Password Exist");
                }
                // Function that check if the password meets the required
                if (password.length() > 8 && password.matches(numbers) && password.matches(specialCharacter)
                        && password.matches(lowerCaseChars) && password.matches(upperCaseChars) ) {
                    System.out.println("Password is Valid!!");
                } else{
                    System.err.println("Invalid Password");
                        }
            }
            // Method That check if the password that meets 3 conditions
             public static  void passWordIsOK(String password){
                 String lowerCaseChars = "(.*[a-z].*)";
                 String numbers = "(.*[0-9].*)";
                 String specialCharacter = "(.*[a-zA-Z0-9].*)";
                 String upperCaseChars = "(.*[A-Z].*)";
                 if (password.length() > 8 || password.matches(lowerCaseChars) && password.matches(specialCharacter)
                         && password.matches(numbers) || password.matches(upperCaseChars)) {
                     System.out.println("Password is Ok!!");
                     System.out.println("Password that meets 3 conditions!!");
                 } else{
                     System.out.println("");

                 }
             }
        }