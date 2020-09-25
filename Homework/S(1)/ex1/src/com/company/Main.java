package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String widthe;
        String lengths;
        System.out.print("give me the width :");
        Scanner scanner = new Scanner(System.in);
        widthe = scanner.next();
        System.out.print("give me the lengths :");
        lengths = scanner.next();
        while (true) {
            System.out.println("1 = area , 2 = circle , 3 = exit");
            int temp = Integer.parseInt(scanner.next());
            switch (temp) {

                case 1:
                    math.area(widthe, lengths);
                    break;

                case 2:
                    math.circle(widthe, lengths);
                    break;


                case 3:
                    break;
            }
            if(temp == 3){
                break;
            }
        }
}
    public static class math {
        static void circle(String width, String lengths) {
            int first = Integer.parseInt(width);
            int second = Integer.parseInt(lengths);
            int circle = (first + first) + (second + second);
            System.out.println(circle);
        }

        static void area(String width, String lengths) {
            int first = Integer.parseInt(width);
            int second = Integer.parseInt(lengths);
            int area = first * second;
            System.out.println(area);
        }




    }














}
