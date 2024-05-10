package com.perscholas.java_basics.PA_303_10_1.GameApp;

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
