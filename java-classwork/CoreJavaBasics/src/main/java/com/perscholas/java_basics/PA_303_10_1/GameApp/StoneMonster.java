package com.perscholas.java_basics.PA_303_10_1.GameApp;

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with stones!";
    }
}
