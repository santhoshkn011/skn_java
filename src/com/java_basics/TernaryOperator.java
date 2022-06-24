/*
Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming.
It is the only conditional operator which takes three operands.
 */
package com.java_basics;

public class TernaryOperator {
    public static void main(String args[]){
        int a=2;
        int b=5;
        int min=(a<b)?a:b; //If the condition is true, will print a or else b.
        System.out.println(min);
    }
}
