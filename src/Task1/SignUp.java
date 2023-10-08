package Task1;

public class SignUp {

    static void getRegister (String Login, String Password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (Login.length() >20) throw new WrongLoginException("Count of symbols in Login should be less than 20");
        if (Login.contains(" ")) throw new WrongLoginException("Login shouldn't contain space");
        if (Password.length() >20) throw new WrongPasswordException("Count of symbols in Password should be less than 20");
        if (Password.contains(" ")) throw new WrongPasswordException("Password shouldn't contain space");
        if (Password != confirmPassword) throw new WrongPasswordException("Confirm your password");
    }

}
