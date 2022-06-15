package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng 1 ");
        int N1 = scanner.nextInt();
        int[] arr1 = new int[N1];
        for (int i = 0; i < N1; i++) {
            System.out.print("Nhập phần tử ở index " + i + " trong mảng 1 ");
            int n = scanner.nextInt();
            arr1[i] = n;
        }

        System.out.print("Nhập số lượng phần tử mảng 2 ");
        int N2 = scanner.nextInt();
        int[] arr2 = new int[N2];
        for (int i = 0; i < N2; i++) {
            System.out.print("Nhập phần tử ở index " + i + " trong mảng 2 ");
            int n = scanner.nextInt();
            arr2[i] = n;
        }

        int[] merged_arr = new int[N1 + N2];
        for (int i = 0; i < N1; i++) {
            merged_arr[i] = arr1[i];
        }
        for (int i = 0; i < N2; i++) {
            merged_arr[i + N1] = arr2[i];
        }
        for (int i = 0; i < N1 + N2 - 1; i++) {
            System.out.print(merged_arr[i] + ",");
        }
        System.out.print(merged_arr[N1 + N2 - 1]);
    }
}
