package com.company;

public class Main {

    public static void main(String[] args) {
        int Numbers = 20;
        int count = 0;
        int N = 2;
        while (count < Numbers) {
            boolean check = true;

            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(N + " ");
            }
            N++;
        }
    }
}
