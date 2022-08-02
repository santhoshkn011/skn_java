package com.java_object_class;

public class StaticVariableExample {
    int rollno;//instance variable
    String name;
    static String college ="IIT";//static variable
    //constructor
    StaticVariableExample(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
}
//Test class to show the values of objects
 class TestStaticVariable1{
    public static void main(String args[]) {
        StaticVariableExample s1 = new StaticVariableExample(111, "Santhosh");
        StaticVariableExample s2 = new StaticVariableExample(222, "Kumar");
        //we can change the college of all objects by the single line of code
        s1.display();
        s2.display();
    }
}


