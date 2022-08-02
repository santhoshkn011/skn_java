//It will be invoked at the time of object creation.
//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
package com.java_object_class;

public class DefaultConstructor {
    int id;
    String name;
    //method to display the value of id and name
    void display(){System.out.println(id+" "+name);}

    //creating a default constructor
    DefaultConstructor(){
        System.out.println("Bike is created");
    }
    //main method
    public static void main(String args[]){
//calling a default constructor
        DefaultConstructor b = new DefaultConstructor();

        //creating objects
        DefaultConstructor s1 = new DefaultConstructor();
        DefaultConstructor s2 = new DefaultConstructor();
//displaying values of the object
        s1.display();
        s2.display();
    }
}
