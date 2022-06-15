package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử ở địa chỉ " + i);
            int n = scanner.nextInt();
            arr[i] = n;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");
        System.out.println("Nhập địa chỉ phần tử cần xóa ");
        int dc = scanner.nextInt();
        if (dc < 0 || dc >= N) {
            System.out.println("Nhập lại vị trí phần tử cần xóa ");
        } else {
            for (int i = dc; i < N; i++) {
                if (i == N - 1) {
                    arr[N - 1] = 0;
                }
                if (i < N - 1) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        System.out.println("Mảng mới:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}

