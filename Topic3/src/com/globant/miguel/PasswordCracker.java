package com.globant.miguel;

import java.util.*;
import java.util.function.BiPredicate;

public class PasswordCracker {
    static Stack<String> passwordsStack= new Stack<>();
    static List<String> badLoginAttempt = new ArrayList<>();

    public static void main(String[] args) {

        int numberOfTest;
        int numberOfUsers;
        String password;
        String loginAttempt;

        Scanner in = new Scanner(System.in);

        System.out.print("Write how many test cases: ");
        numberOfTest = in.nextInt();
        for (int i = 1; i <= numberOfTest; i++) {
            System.out.println("Test number " + i);
            System.out.print("\tWrite how many users password you have: ");
            numberOfUsers = in.nextInt();
            List<String> passwords = new ArrayList<>(numberOfUsers);
            for (int j = 1; j <= numberOfUsers; j++) {
                System.out.print("\t\tWrite the number " + j + " user password: ");
                password = in.next();
                passwords.add(password);
            }
            System.out.print("\t\t\tWrite the login attempt: ");
            loginAttempt = in.next();
            if(isInLoginAttempt.test(passwords, loginAttempt)) {
                System.out.print("\t\t\t\t");
                while (!passwordsStack.isEmpty()) {
                    System.out.print(passwordsStack.pop() + " ");
                }
                System.out.println("");
            } else {
                System.out.println("\t\t\t\tWRONG PASSWORD");
            }
        }
    }

    static BiPredicate<List<String>, String> isInLoginAttempt = (pass, loginAttempt) -> {
        if(badLoginAttempt.contains(loginAttempt)) {
            return false;
        }
        if(loginAttempt.length() == 0) {
            return true;
        }
        for(String p : pass) {
            if(loginAttempt.startsWith(p) && PasswordCracker.isInLoginAttempt.test(pass, loginAttempt.substring(p.length()))) {
                passwordsStack.push(p);
                return true;
            }
        }
        badLoginAttempt.add(loginAttempt);
        return false;
    };

}
