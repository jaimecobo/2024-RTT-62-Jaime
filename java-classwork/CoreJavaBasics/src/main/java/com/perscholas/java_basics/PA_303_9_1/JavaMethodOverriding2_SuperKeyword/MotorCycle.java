package com.perscholas.java_basics.PA_303_9_1.JavaMethodOverriding2_SuperKeyword;

class MotorCycle extends Bicycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //changed define_me(); with super.define_me(); to be able to print the string returned by Bicycle Class

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
