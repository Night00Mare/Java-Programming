package com.alireza.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        int temp;
        Math math = new Math();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("first number is :");
            firstNumber = Float.parseFloat(scanner.next());
            System.out.print("second number is :");
            secondNumber = Float.parseFloat(scanner.next());
            math.firstNumber = firstNumber;
            math.secondNumber = secondNumber;
            System.out.println("0 = exit 1 = sum 2 = multiply 3 = subtract 4 = division");
            temp = Integer.parseInt(scanner.next());
            switch (temp){
                case 1:
                    System.out.println(math.sum());
                    break;
                case 2:
                    System.out.println(math.multiply());
                    break;
                case 3:
                    System.out.println(math.subtract());
                    break;
                case 4:
                    if(secondNumber == 0 ){
                        System.out.println("secondnumber cannot be zero pls change it\n"+"seecond number is:");
                        secondNumber = Float.parseFloat(scanner.next());
                    }
                    System.out.println(math.division());

                    break;
                default:
                    break;
            }
            if (temp == 0){
                break;
            }
        }
    }
}
