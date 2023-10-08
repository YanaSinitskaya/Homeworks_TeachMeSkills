package Task1;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        String Login;
        String Password;
        String confirmPassword;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you login");
        Login = scan.nextLine();
        System.out.println("Enter you password");
        Password = scan.nextLine();
        System.out.println("Confirm your password");
        confirmPassword = scan.nextLine();
        try {
            SignUp.getRegister(Login, Password, confirmPassword);
        }
            catch (WrongLoginException loginException) {
                System.out.println(loginException.getMessage());
        }
            catch (WrongPasswordException passwordException){
                System.out.println(passwordException.getMessage());
        }
    }
}
