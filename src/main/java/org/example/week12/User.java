package org.example.week12;

import java.util.Objects;


public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isValidLogin(String enteredUsername, String enteredPassword) {
        return Objects.equals(enteredUsername, this.username) && Objects.equals(enteredPassword, this.password);
    }

    public boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?].*");
    }



    public void resetPassword(String newPassword) {
        if (isPasswordStrong(newPassword)) {
            this.password = newPassword;
            System.out.println("Resetting password.");
        } else {
            System.out.println("Resetting password failed.");
        }
    }
}
