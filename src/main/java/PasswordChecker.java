import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PasswordChecker {

    private static Logger logger = LogManager.getLogger();

        public static boolean passwordIsValid (String password) {

            String lowerCaseChars = "(.*[a-z].*)";
            String numbers = "(.*[0-9].*)";
            String specialCharacter = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            String upperCaseChars = "(.*[A-Z].*)";

            if (password.isEmpty()){
                System.err.println("Password Exist");
                logger.info("Password Exist");
            }
            if (password.length() > 8) {
            } else {
                System.err.println("Password should be longer than than 8 characters");
                logger.error("Password should be longer than than 8 characters");

            }
            if (password.matches(lowerCaseChars)) {
            } else {
                System.err.println("Password should have at least one lowercase letter");
                logger.error("Password should have at least one lowercase letter");
            }
            if (password.matches(upperCaseChars)) {
            } else {
                System.err.println("Password should have at least one uppercase letter");
                logger.error("Password should have at least one uppercase letter");
            }
            if (password.matches(numbers)) {
            } else {
                System.err.println("Password should at least have one digit");
                logger.error("Password should at least have one digit");
            }

            if (password.matches(specialCharacter)) {
            } else {
                System.err.println("Password should have at least one special character");
                logger.error("Password should have at least one special character");
            }

            if (password.length() > 8 && password.matches(lowerCaseChars) && password.matches(upperCaseChars)
                    && password.matches(numbers) && password.matches(specialCharacter) == true){
                System.out.println("Password is Valid");
                logger.info("Password is Valid");
            } else {
                System.err.println("Invalid Password");
                logger.error("Invalid Password");
                logger.trace("load");
            }

            return false;
        }
        public static boolean passwordIsOk (String password) {

            String lowerCaseChars = "(.*[a-z].*)";
            String numbers = "(.*[0-9].*)";
            String specialCharacter = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            String upperCaseChars = "(.*[A-Z].*)";
            if (password.length() > 8 && password.matches(lowerCaseChars) | password.matches(upperCaseChars)
                    && password.matches(numbers) | password.matches(specialCharacter) == true){
                System.out.println("Password is OK");
                logger.info("Password is OK");
            }

            return false;
        }
}