package com.w3spoint;
 
import java.io.Serializable;
 
public class SingletonTest implements Serializable {   
    //Private constructor to prevent instantiation of the class from other classes.
    private SingletonTest(){}
 
    private static class SingletonHelper{
        private static final SingletonTest INSTANCE = new SingletonTest();
    }
 
    public static SingletonTest getInstance(){
        return SingletonHelper.INSTANCE;
    }
 
    protected Object readResolve() {  
        return getInstance();  
    }  
 
}