/*
for(initialization, condition, increment/decrement) {
//block of statements
}
 */
package com.java_control_statements;

public class ForLoopStatement {
    public static void main(String[] args) {
        int sum = 0;
        for(int j = 1; j<=10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);
    }
}
