package com.alireza.usc;

public class Num_Info implements MyInteger {

    int num;
    @Override
    public Boolean isEven(int num) {
        if(num%2 == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean isOdd(int num) {
        if(isEven(num) == false){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean isPositive(int num) {
        if(num>=0){
            return true;
        }else
            return false;
    }

    @Override
    public Boolean isNegative(int num) {
        if (num<0){
            return true;
        }else
            return false;
    }

    @Override
    public Boolean isZero(int num) {
        if (num == 0){
            return true;
        }else
            return false;
    }
}
