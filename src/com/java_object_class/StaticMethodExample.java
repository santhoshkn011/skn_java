package com.java_object_class;

public class StaticMethodExample {
    int rollno;
    String name;
    static String college = "IIT";
    //static method to change the value of static variable
    static void change(){
        college = "IIT Banglore";
    }
    //constructor to initialize the variable
    StaticMethodExample(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
//Test class to create and display the values of object
class TestStaticMethod {
    public static void main(String args[]) {
        StaticMethodExample.change();
        //creating objects
        StaticMethodExample s1 = new StaticMethodExample(111, "Santhosh");
        StaticMethodExample s2 = new StaticMethodExample(222, "Kisalay");
        StaticMethodExample s3 = new StaticMethodExample(333, "Swatika");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

/*
A method that has static keyword is known as static method.
In other words, a method that belongs to a class rather than an instance of a class is known as a static method.
We can also create a static method by using the keyword static before the method name.

The main advantage of a static method is that we can call it without creating an object.
It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.
 */
