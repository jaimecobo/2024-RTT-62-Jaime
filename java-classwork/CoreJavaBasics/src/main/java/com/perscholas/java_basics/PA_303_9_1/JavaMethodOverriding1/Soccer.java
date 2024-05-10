package com.perscholas.java_basics.PA_303_9_1.JavaMethodOverriding1;

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer";
    }

    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

}
