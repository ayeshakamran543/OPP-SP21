package calculator;

import java.util.Scanner;

public class L6_ASSIGN_RUN {

    public static void main(String[] args) {
        Calculator c1 = new Calculator(12, 4);
        Scanner object = new Scanner(System.in);
        System.out.println("-------CALCULATOR--------");
        System.out.println("Press 1 for sum");
        System.out.println("Press 2 for multiplication");
        System.out.println("Press 3 for division");
        System.out.println("Press 4 for modulus");
        System.out.println("Press 5 for sin");
        System.out.println("Press 6 for cos");
        System.out.println("Press 7 for tan");
        int num = object.nextInt();
        switch (num) {
            case 1:
                Calculator.sum();
                break;
            case 2:
                Calculator.multiply();
                break;
            case 3:
                Calculator.divide();
                break;
            case 4:
                Calculator.modulus();
                break;
            case 5:
                Calculator.sine();
                break;
            case 6:
                Calculator.cosine();
                break;
            case 7:
                Calculator.tangent();
                break;

        }
    }

}


