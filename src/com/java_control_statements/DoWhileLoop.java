/*
The do-while loop checks the condition at the end of the loop after executing the loop statements.
When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.

It is also known as the exit-controlled loop since the condition is not checked in advance.

The syntax of the do-while loop is given below.
do
{
//statements
} while (condition);
 */
package com.java_control_statements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        }while(i<=10);
    }
}
