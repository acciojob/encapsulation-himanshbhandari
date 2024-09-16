package com.driver;

public class Main {
    public static void main(String []args){
        RWOnly ro=new RWOnly();
//    ro.name;  //this give error because cant access private member using dot operator

        ro.setName("new name set");
        ro.getName();
        System.out.println(ro.getName());
    }
}