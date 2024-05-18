package com.perscholas.java_basics.slides_303_14;

public class MainFunctionalKBA {
    public static void main(String[] args) {
        // this and the implementation below are the same
        MyFunctionalInterfaceKBA fi = (n) -> {
            return n * n;
        };

//        MyFunctionalInterfaceKBA fi1 = new MyFunctionalInterfaceKBA() {
//            @Override
//            public Integer sqr(int a) {
//                return a * a;
//            }
//        };

        System.out.println(fi.sqr(5));
    }
}
