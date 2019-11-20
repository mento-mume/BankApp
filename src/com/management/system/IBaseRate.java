package com.management.system;

public interface IBaseRate {
    //write method that returns base rates
    default double getBaseRate(){
        return 2.5;
    }
}
