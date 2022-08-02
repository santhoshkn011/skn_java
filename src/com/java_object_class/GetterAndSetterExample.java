package com.java_object_class;

public class GetterAndSetterExample {
    private int roll;
    private String name;
    public int getRoll()    //accessor method
    {
        return roll;
    }
    public void setRoll(int roll) //mutator method
    {
        this.roll = roll;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Roll no.: "+roll);
        System.out.println("Student name: "+name);
    }
}

/*
Accessor Method:
The method(s) that reads the instance variable(s) is known as the accessor method.
We can easily identify it because the method is prefixed with the word get. It is also known as getters.
It returns the value of the private field. It is used to get the value of the private field.

Mutator Method:
The method(s) read the instance variable(s) and also modify the values.
We can easily identify it because the method is prefixed with the word set.
It is also known as setters or modifiers. It does not return anything.
It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.
 */
