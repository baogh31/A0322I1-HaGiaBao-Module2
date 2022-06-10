package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng gửi ");
        month = input.nextInt();
        System.out.println("Nhập lãi suất ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Lãi suất nhận được là " + totalInterest);
    }
}
