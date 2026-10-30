package recovery.methods.regex;

public class RegistrationValidator {
    public static boolean validatePassword(String password) {
        return password != null &&
                password.matches(
                        "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,20}"
                );
    }

    public static boolean validateLogin(String login) {
        return login != null &&
                login.matches("[a-zA-Z][a-zA-Z0-9_]{4,11}");
    }

    public static boolean validateEmail(String email) {
        return email != null &&
                email.matches(
                        "[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}"
                );
    }

    public static boolean validatePhone(String phone) {
        return phone != null &&
                phone.matches(
                        "\\+7 \\([0-9]{3}\\) [0-9]{3}-[0-9]{2}-[0-9]{2}"
                );
    }
}
