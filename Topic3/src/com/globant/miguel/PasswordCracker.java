package com.globant.miguel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PasswordCracker {
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("because");
        passwords.add("can");
        passwords.add("do");
        passwords.add("must");
        passwords.add("we");
        passwords.add("what");

        String loginAttempt = "wedowhatwemustbecausewecan";

        Stack <String> passwordsStack = new Stack<>();
        while (loginAttempt.length()!=0){

            for (String password:passwords) {
                if(loginAttempt.startsWith(password))
                {
                    loginAttempt = loginAttempt.substring(password.length());
                    passwordsStack.push(password);
                    System.out.println(loginAttempt);
                }

            }
        }
        while (!passwordsStack.isEmpty()) {
            System.out.print(passwordsStack.pop() + " ");
        }
    }

}
