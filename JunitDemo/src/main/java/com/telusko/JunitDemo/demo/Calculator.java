package com.telusko.JunitDemo.demo;

public class Calculator {
    public int add(int a,int b){
        int res=0;

        if(a>b){
            res=a;
        }
        else{
            res=a+b;
        }
        return res;
    }
    public int sub(int a,int b){
        int res=0;

        if(a>b){
            res=a-b;
        }
        else{
            res=b;
        }
        return res;
    }
    public int mul(int a,int b){
        int res=0;
        return a*b;
    }
}
