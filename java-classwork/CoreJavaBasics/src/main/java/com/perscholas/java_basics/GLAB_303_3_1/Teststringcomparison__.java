package com.perscholas.java_basics.GLAB_303_3_1;

public class Teststringcomparison__ {
    public static void main(String args[]){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
    }

    /*
    We can compare String in Java based on content and reference.
    It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
    There are three ways to compare String in Java:
        By Using equals() Method.
        By Using == Operator.
        By compareTo() Method.

    -- By Using == operator --
    The == operator compares references, not values.

     */
}
