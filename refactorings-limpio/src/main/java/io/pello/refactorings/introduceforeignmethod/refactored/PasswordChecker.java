package io.pello.refactorings.introduceforeignmethod.refactored;

public class PasswordChecker {
    public String improvePassword(String password) {
        if (password.length() < 5) {
            return "****" + password + "****";
        } else {
            return password;
        }
    }

    private static String palindromo(String password) {
        return new String(password
                + new StringBuilder(password).reverse().toString());
    }
}
