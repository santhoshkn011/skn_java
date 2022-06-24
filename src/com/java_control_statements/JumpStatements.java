/*
Jump statements are used to transfer the control of the program to the specific statements.
In other words, jump statements transfer the execution control to the other part of the program.
There are two types of jump statements in Java, i.e., break and continue.
 */
package com.java_control_statements;

public class JumpStatements {
    public static void main(String[] args) {
        //Java break statement for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
        System.out.println();
        //break statement example with labeled for loop
        a:
        for(int i = 0; i<= 10; i++) {
            b:
            for (int j = 0; j <= 15; j++) {
                c:
                for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 5) {
                        break a;
                    }
                }
            }
        }
        System.out.println();
        //Java continue statement
        for(int i = 0; i<= 2; i++) {

            for (int j = i; j<=5; j++) {

                if(j == 4) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}

/*
As the name suggests, the break statement is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement.
However, it breaks only the inner loop in the case of the nested loop.

The break statement cannot be used independently in the Java program, i.e., it can only be written inside the loop or switch statement.

Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately.
 */