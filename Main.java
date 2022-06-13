package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên ");
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name);
    }
}