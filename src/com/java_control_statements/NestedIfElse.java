package com.java_control_statements;

public class NestedIfElse {
    public static void main(String[] args) {
        String address = "Delhi, India";

        if(address.endsWith("India")) {
            if(address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            }else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }else {
                System.out.println(address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in India");
        }
    }
}

//In nested if-statements, the if statement can contain a if or if-else statement inside another if or else-if statement.
