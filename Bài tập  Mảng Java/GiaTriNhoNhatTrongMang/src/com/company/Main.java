package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử index " + i + " ");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int min= arr[0];
        for (int i = 0; i < size-1; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print("Giá trị phần tử nhỏ nhất trong mảng là " + min);
    }
}
