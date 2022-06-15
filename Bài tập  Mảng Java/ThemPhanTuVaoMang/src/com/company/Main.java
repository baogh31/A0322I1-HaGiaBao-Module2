package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng ");
        int N = scanner.nextInt();
        System.out.println("Nhập số cần chèn vào mảng ");
        int X = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn trong mảng ");
        int index = scanner.nextInt();
        int pt_arr = N + 1;
        int[] arr = new int[pt_arr];
        arr[pt_arr - 1] = 0;
        if (index <= 0 || index > N + 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.println("Nhập phần tử ở vị trí " + i);
                int num = scanner.nextInt();
                arr[i] = num;
            }
            System.out.print("[" + arr[0]);
            for (int i = 1; i < N; i++) {
                System.out.print("," + arr[i]);
            }
            System.out.println("]");
            System.out.print("=>[");
            for (int i = pt_arr - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
            for (int i = 0; i < pt_arr - 1; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println(arr[N] + "]");
        }

    }
}
