package com.java_control_statements;

public class IfElseIfStatement {
    public static void main(String[] args) {
        String city = "Hyderabad";
        if(city == "Meerut") {
            System.out.println("city is meerut");
        }else if (city == "Noida") {
            System.out.println("city is noida");
        }else if(city == "Agra") {
            System.out.println("city is agra");
        }else {
            System.out.println(city);
        }
    }
}

/*
The if-else-if statement contains the if-statement followed by multiple else-if statements.
In other words, we can say that it is the chain of if-else statements that create a decision tree where the program may enter in the block of code where the condition is true.
We can also define an else statement at the end of the chain.
 */
