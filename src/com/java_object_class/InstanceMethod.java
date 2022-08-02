/*
The method of the class is known as an instance method. It is a non-static method defined in the class.
Before calling or invoking the instance method, it is necessary to create an object of its class.
 */
package com.java_object_class;

public class InstanceMethod {
    public static void main(String [] args)
    {
//Creating an object of the class
        InstanceMethod obj = new InstanceMethod();
//invoking instance method
        System.out.println("The sum is: "+obj.add(12, 13));
    }
    int s;
    //user-defined method because we have not used static keyword
    public int add(int a, int b) {
        s = a+b;
//returning the sum
        return s;
    }
}
