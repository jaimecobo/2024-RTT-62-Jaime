package com.perscholas.java_basics.PA_303_9_1.JavaMethodOverriding1;

class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
