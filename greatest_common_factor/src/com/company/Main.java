package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất ");
        num1 = input.nextInt();
        System.out.println("Nhập số thứ 2");
        num2 = input.nextInt();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        int greatestCF = 0;
        if (num1 == 0 && num2 == 0) {
            System.out.println("Không có ước chung lớn nhất ");
        } else if (num1 == 0 || num2 == 0) {
            System.out.println("Ước chung lớn nhất: " + (num1 + num2));
        } else {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    greatestCF = i;
                }
            }
            System.out.println("Ước chung lớn nhất là " + greatestCF);
        }
    }
}
