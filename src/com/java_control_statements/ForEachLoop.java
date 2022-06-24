/*
Java provides an enhanced for loop to traverse the data structures like array or collection.
In the for-each loop, we don't need to update the loop variable. The syntax to use the for-each loop in java is given below.

for(data_type var : array_name/collection_name){
//statements
}
 */
package com.java_control_statements;

public class ForEachLoop {
    public static void main(String[] args) {
        String names[] = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for(String name:names) {
            System.out.println(name);
        }
    }
}
