package com.w3spoint;
 
public class SingletonTest {
private static SingletonTest instance;
 
    //Private constructor to prevent instantiation of the class from other classes.
    private SingletonTest(){}
 
    public static synchronized SingletonTest getInstance(){
    	if(instance == null){
            instance = new SingletonTest();
        }
        return instance;
    }
}