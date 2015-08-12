package com.factory.abstractclass;


public abstract class Operation
{
    public double NumA;
    public double NumB;
    public void setNumA(double a){
    	NumA = a;
    }
    public double getNumA(){
    	return NumA;
    }
    public void setNumB(double b){
    	NumB = b;
    }
    public double getNumB(){
    	return NumB;
    }
    public abstract double GetResult();
}