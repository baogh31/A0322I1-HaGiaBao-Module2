package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số bậc nhất: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số tự do: ");
        double c = scanner.nextDouble();
        System.out.println(a + "^2x" + b + "x+" + c + "=0");
        QuadraticEquation Pt2 = new QuadraticEquation(a, b, c);
        double delta = Pt2.getDiscriminant();
        double r1 = Pt2.getRoot1();
        double r2 = Pt2.getRoot2();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm ");
            System.out.print(r1 + " và " + r2);
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: " + r1);
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }
    }
}

