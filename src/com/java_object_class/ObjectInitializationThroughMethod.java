//we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.
// Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
package com.java_object_class;

class Student2{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
class ObjectInitializationThroughMethod {
    public static void main(String args[]) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.insertRecord(111, "Santhosh");
        s2.insertRecord(222, "Kumar");
        s1.displayInformation();
        s2.displayInformation();
    }
}


