//Example to understand the types of variables in java
package com.java_basics;

public class JavaVariables {
    static int a = 1; //static variable
    //method
    void method()
    {
        int a = 2; //local variable
        int b = 3;
    }
    //main method
    public static void main(String args[])
    {
        int c = 4;//instance variable
        //int d = a + b + c;  // b cannot be accessed as it is a local variable for method.
        int d = a + c ;
        System.out.println(d);
        a = 6;
        int e = a + c;
        System.out.println(e);
        float f = e; //widening
        System.out.println(f);
        float g = 15.0f;
        int h = (int)g; //Narrowing (Typecasting)
        System.out.println(h);
        int i = 130;
        byte j = (byte)i; //Overflow
        System.out.println(j);
        byte k = 16;
        byte l = 17;
        byte m = (byte)(k + l); //Adding Lower Type
        System.out.println(m);
    }
}//end of class


/*
1) Local Variable
A variable declared inside the body of the method is called local variable.
You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.

2) Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.

It is called an instance variable because its value is instance-specific and is not shared among instances.

3) Static variable
A variable that is declared as static is called a static variable. It cannot be local.
You can create a single copy of the static variable and share it among all the instances of the class.
Memory allocation for static variables happens only once when the class is loaded in the memory.
 */

