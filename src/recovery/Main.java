package recovery;

import recovery.methods.regex.RegistrationValidator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        String[] logins = {
                "Viktor_123",
                "123Viktor",
                "abc",
                "admin5",
                "user-name"
        };

        System.out.println("=== Проверка логинов ===");

        for (String login : logins) {
            System.out.println(
                    login + ": " +
                            RegistrationValidator.validateLogin(login)
            );
        }

        String[] passwords = {
                "Java2026",
                "MyPassword123",
                "password",
                "JAVA2026",
                "Abc123"
        };

        System.out.println("\n=== Проверка паролей ===");

        for (String password : passwords) {
            System.out.println(
                    password + ": " +
                            RegistrationValidator.validatePassword(password)
            );
        }

        String[] emails = {
                "user123@gmail.com",
                "viktor_k@mail.ru",
                "usergmail.com",
                "@mail.ru",
                "user@mail"
        };

        System.out.println("\n=== Проверка Email ===");

        for (String email : emails) {
            System.out.println(
                    email + ": " +
                            RegistrationValidator.validateEmail(email)
            );
        }

        String[] phones = {
                "+7 (999) 123-45-67",
                "89991234567",
                "+7 999 1234567"
        };

        System.out.println("\n=== Проверка телефонов ===");

        for (String phone : phones) {
            System.out.println(
                    phone + ": " +
                            RegistrationValidator.validatePhone(phone)
            );
        }

        System.out.println("\n=== Поиск номеров заказов ===");

        String text = "Заказы: A-123, B-456, C-789";

        Pattern pattern = Pattern.compile("[A-Z]-[0-9]{3}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}