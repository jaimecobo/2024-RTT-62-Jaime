package com.perscholas.java_basics.GLAB_303_3_1;

public class TeststringcomparisonCompareTo {
    public static void main(String args[]){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3="Perschola";
        String s4="PerscholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
    }

    /*
    We can compare String in Java based on content and reference.
    It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
    There are three ways to compare String in Java:
        By Using equals() Method.
        By Using == Operator.
        By compareTo() Method.

    -- By Using compareTo() method --
    The String class's compareTo() method compares values lexicographically.
    It returns an integer value that describes if the first string is less than, equal to, or greater than the second string.
    // return 0 if this string is the same as another;
    // <0 if lexicographically less than another; or >0

    Suppose s1 and s2 are two String objects. If:
    s1 == s2 : The method returns 0.
    s1 > s2 : The method returns a positive value.
    s1 < s2 : The method returns a negative value.
    */
}
