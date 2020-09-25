package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ad,bc,ed,bf,af,ec;
        String[] name = {"c","d","f","a","b","e"};
        int[] number = new int[6];
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        Scanner scanner = new Scanner(System.in);

           for(int counter = 0;counter<6;counter++) {
               System.out.print(name[counter] + "=");
               try {
                   number[counter] = Integer.parseInt(scanner.next());
               } catch (NumberFormatException myProblem) {
                   System.out.println("Some thing is wrong pls try again !!!");
                   counter--;
               } finally {
                   continue;
               }
           }
            ad= number[3]*number[1] ;bc= number[4]*number[0] ;ed = number[5]*number[1] ;bf = number[4]*number[2] ; af = number[3]*number[2] ; ec = number[5]*number[0];
            if(ad - bc ==0){
                System.out.println("there is no way to answer !!!/");
            }else{
                System.out.println("x ="+ (float)(ed - bf)/(ad-bc));
                System.out.println("x ="+ (float)(af-ec)/(ad-bc));
            }
           }


}
