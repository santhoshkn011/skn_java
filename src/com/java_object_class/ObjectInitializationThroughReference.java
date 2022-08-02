//Initializing an object means storing data into the object.
package com.java_object_class;

class Student1 {
    int id;
    String name;
}
class ObjectInitializationThroughReference{
    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.id=11; //initialize by reference variable, here s1 is reference variable, ".id will access member id"
        s1.name="Santhosh";
        System.out.println(s1.id+" "+s1.name);//printing members with a white space
    }
}

