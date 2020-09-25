package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum =0;
        int division=0;
        float average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many courses?");
        int temp = Integer.parseInt(scanner.next());
        int array[][] = new int[temp][2] ;



        for(int counter = 0;counter<temp;counter++){
            System.out.println("course is :");
            String course = scanner.next();

            System.out.println("Mark is :");
           array[counter][0] = Integer.parseInt(scanner.next());

            System.out.println("index is : ");
            array[counter][1] = Integer.parseInt(scanner.next());


        }

        for(int counter = 0;counter<temp;counter++){

            int thing = array[counter][0]*array[counter][1];

            sum += thing;

            division += array[counter][1];

        }
        System.out.println(sum);
        System.out.println(division);

        average = (float)sum/division;
        System.out.print("average is :"+" "+ average+"\n");

        if(average>=12){
            System.out.println("congratulation u made it");

        }else {
            System.out.println("sorry u didnt make it");
        }















    }
}
