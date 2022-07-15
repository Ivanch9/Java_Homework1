package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
        System.out.println("please, enter number one");
        Scanner sc = new Scanner(System.in);
        String firstNumber = sc.next();
        if (firstNumber.equals("stop")) {
            break;
        }
        int intfirstNumber = Integer.parseInt(firstNumber.trim());
        System.out.println("please, enter second number");
        String secondNumber = sc.next();
        if (secondNumber.equals("stop")) {
            break;
        }
        int intsecondNumber = Integer.parseInt(secondNumber.trim());
        //System.out.println(secondNumber);
        System.out.println("please, enter +,-,*,/");
        String operation = sc.next();
        //System.out.println(operation);
        if (operation.equals("stop")) {
                break;
            }
        if (!operation.contains("+") & !operation.contains("-") & !operation.contains("*") & !operation.contains("/")) {
            System.out.println("transaction entry error");
        }
        else if (operation.equals("-")) {
            //System.out.println(firstNumber+secondNumber);
            int a = intfirstNumber - intsecondNumber;
            System.out.printf(intfirstNumber + "-" + intsecondNumber + "=" + a);
            System.out.println();
                    }
        else if (operation.equals("+")) {
            int a = intfirstNumber + intsecondNumber;
            System.out.printf(intfirstNumber + "+" + intsecondNumber + "=" + a);
            System.out.println();
        }
        else if (operation.equals("*")) {
            int a = intfirstNumber * intsecondNumber;
            System.out.printf(intfirstNumber + "*" + intsecondNumber + "=" + a);
            System.out.println();
        }
        else if (operation.equals("/") & intsecondNumber==0) {
            System.out.println("division by zero");
        }
        else if (operation.equals("/")) {
            int a = intfirstNumber / intsecondNumber;
            System.out.printf(intfirstNumber + "/" + intsecondNumber + "=" + a);
            System.out.println();
        }
        }
    }
}
