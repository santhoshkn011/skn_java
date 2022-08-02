/*
In real time development, we create classes and use it from another class.
It is a better approach this. Let's see a simple example, where we are having main() method in another class.
 */
package com.java_object_class;

class Student{
    int id=10;
    String name = "Santhosh";
}
//Creating another class TestStudent1 which contains the main method
class ClassInsideClass{
    public static void main(String args[]){
        Student s1= new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
