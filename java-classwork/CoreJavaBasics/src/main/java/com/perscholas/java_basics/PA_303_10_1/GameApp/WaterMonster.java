package com.perscholas.java_basics.PA_303_10_1.GameApp;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with water!";
    }
}
