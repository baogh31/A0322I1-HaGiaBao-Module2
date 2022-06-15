package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi ");
        String str = scanner.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.print("Nhập ký tự cần đếm ");
        String c = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c.charAt(0) == arr[i]) {
                count++;
            }
        }
        System.out.println("Ký tự "+c+" xuất hiện "+count+" lần");
    }
}
