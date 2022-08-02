//Java Program to illustrate how to define a class and fields
//Defining a Student class.
package com.java_object_class;

public class ObjectAndClassExample {
    //defining fields
    int id;//field or data member or instance variable
    String name;
    //creating main method inside the Student class
    public static void main(String args[]){
        //Creating an object or instance
        ObjectAndClassExample s1 = new ObjectAndClassExample();//creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);
    }
}

