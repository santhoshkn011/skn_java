//Operators in Java
package com.java_basics;

public class UnaryOperator {
    public static void main(String args[]){
        int x = 1;
        int y = -2;
        int a = 2;
        boolean z=true;
        //incrementing/decrementing a value by one
        System.out.println(x++);//1 (2)
        System.out.println(++x);//3
        System.out.println(x--);//3 (2)
        System.out.println(--x);//1
        System.out.println(~y);//1 (positive of total minus, positive starts from 0) {-2,-1 <mirror>  0,1}
        System.out.println(~a);//-3 (minus of total positive value which starts from 0) {-3,-2,-1 <mirror> 0,1,2}
        System.out.println(!z);//false
    }
}
