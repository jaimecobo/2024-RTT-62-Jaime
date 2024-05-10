package com.perscholas.java_basics.slides_303_9_inheritance;

public class OuterClass {
    public OuterClass(){
        InnerClass ic = new InnerClass();
    }



    private class InnerClass {
        int x;
        int y;
        int z;
    }
}
