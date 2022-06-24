package com.java_control_statements;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }
    }
}

/*
The case variables can be int, short, byte, char, or enumeration. String type is also supported since version 7 of Java

Cases cannot be duplicate

Default statement is executed when any of the case doesn't match the value of expression. It is optional.

Break statement terminates the switch block when the condition is satisfied.

It is optional, if not used, next case is executed.

While using switch statements, we must notice that the case expression will be of the same type as the variable. However, it will also be a constant value.
 */