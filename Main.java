package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ " + j + " hàng " + i + ": ");
                int num = scanner.nextInt();
                arr[i][j] = num;
            }
        }
        System.out.println("Ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Nhập cột muốn tính tổng (số thứ tự cột khác chỉ số mảng): ");
        int cot = scanner.nextInt();
        if (cot <= 0 || cot > column) {
            System.out.println("Nhập sai ");
        } else {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (j == cot) {
                        sum += arr[i][cot - 1];
                    }
                }
            }
            System.out.println("Tổng cột cần tính là: " + sum);
        }
    }
}