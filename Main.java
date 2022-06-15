package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng ");
        int row = scanner.nextInt();
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Nhập phần tử thứ " + j + " hàng " + i + ": ");
                int num = scanner.nextInt();
                arr[i][j] = num;
            }
        }
        System.out.println("Ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        int dem = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][dem];
            dem++;
        }
        System.out.println("Tổng đường chéo chính: " + sum);
    }
}
