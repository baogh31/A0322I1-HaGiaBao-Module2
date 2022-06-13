package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        Integer num = scanner.nextInt();
        int chuc = num / 10;
        int donvi = num - chuc * 10;
        int tram = num / 100;
        int chuc_tram = (num - tram * 100) / 10;
        int donvi_tram = num - tram * 100 - chuc_tram * 10;
        if (num <= 0 || num > 999) {
            System.out.println("Nhập lại số");
        }
        //Số bé hơn = 10
        if (num >= 1 && num <= 10) {
            switch (num) {
                case 1:
                    System.out.print(" một");
                    break;
                case 2:
                    System.out.print(" hai");
                    break;
                case 3:
                    System.out.print(" ba");
                    break;
                case 4:
                    System.out.print(" bốn");
                    break;
                case 5:
                    System.out.print(" năm");
                    break;
                case 6:
                    System.out.print(" sáu");
                    break;
                case 7:
                    System.out.print(" bảy");
                    break;
                case 8:
                    System.out.print(" tám");
                    break;
                case 9:
                    System.out.print(" chín");
                    break;
                case 10:
                    System.out.print(" mười");
                    break;
            }
        }
        //Số từ 10 đến 20
        if (num > 10 && num <= 20) {
            switch (donvi) {
                case 1:
                    System.out.print(" mười một");
                    break;
                case 2:
                    System.out.print(" mười hai");
                    break;
                case 3:
                    System.out.print(" mười ba");
                    break;
                case 4:
                    System.out.print(" mười bốn");
                    break;
                case 5:
                    System.out.print(" mười lăm");
                    break;
                case 6:
                    System.out.print(" mười sáu");
                    break;
                case 7:
                    System.out.print(" mười bảy");
                    break;
                case 8:
                    System.out.print(" mười tám");
                    break;
                case 9:
                    System.out.print(" mười chín");
                    break;
                case 0:
                    System.out.print(" hai mươi");
                    break;
            }
        }
        //Số từ 20 đến 100
        if (num > 20 && num < 100) {
            switch (chuc) {
                case 3:
                    System.out.print(" ba mươi ");
                    break;
                case 4:
                    System.out.print(" bốn mươi ");
                    break;
                case 5:
                    System.out.print(" năm mươi ");
                    break;
                case 6:
                    System.out.print(" sáu mươi ");
                    break;
                case 7:
                    System.out.print(" bảy mươi ");
                    break;
                case 8:
                    System.out.print(" tám mươi ");
                    break;
                case 9:
                    System.out.print(" chín mươi ");
                    break;
            }
            switch (donvi) {
                case 1:
                    System.out.print("một");
                    break;
                case 2:
                    System.out.print("hai");
                    break;
                case 3:
                    System.out.print("ba");
                    break;
                case 4:
                    System.out.print("bốn");
                    break;
                case 5:
                    System.out.print("lăm");
                    break;
                case 6:
                    System.out.print("sáu");
                    break;
                case 7:
                    System.out.print("bảy");
                    break;
                case 8:
                    System.out.print("tám");
                    break;
                case 9:
                    System.out.print("chín");
                    break;
                default:
                    System.out.print(" ");

            }
        }
        //Số từ 100 đến 999
        if (num > 100 && num <= 999) {
            switch (tram) {
                case 1:
                    System.out.print("một trăm");
                    break;
                case 2:
                    System.out.print("hai trăm");
                    break;
                case 3:
                    System.out.print("ba trăm");
                    break;
                case 4:
                    System.out.print("bốn trăm");
                    break;
                case 5:
                    System.out.print("năm trăm");
                    break;
                case 6:
                    System.out.print("sáu trăm");
                    break;
                case 7:
                    System.out.print("bảy trăm");
                    break;
                case 8:
                    System.out.print("tám trăm");
                    break;
                case 9:
                    System.out.print("chín trăm");
                    break;
                default:
                    System.out.print(" ");
            }
            switch (chuc_tram) {
                case 1:
                    System.out.print(" mười");
                    break;
                case 2:
                    System.out.print(" hai mươi");
                    break;
                case 3:
                    System.out.print(" ba mươi");
                    break;
                case 4:
                    System.out.print(" bốn mươi");
                    break;
                case 5:
                    System.out.print(" năm mươi");
                    break;
                case 6:
                    System.out.print(" sáu mươi");
                    break;
                case 7:
                    System.out.print(" bảy mươi");
                    break;
                case 8:
                    System.out.print(" tám mươi");
                    break;
                case 9:
                    System.out.print(" chín mươi");
                    break;
            }
            switch (donvi_tram) {
                case 1:
                    System.out.print(" một");
                    break;
                case 2:
                    System.out.print(" hai");
                    break;
                case 3:
                    System.out.print(" ba");
                    break;
                case 4:
                    System.out.print(" bốn");
                    break;
                case 5:
                    System.out.print(" lăm");
                    break;
                case 6:
                    System.out.print(" sáu");
                    break;
                case 7:
                    System.out.print(" bảy");
                    break;
                case 8:
                    System.out.print(" tám");
                    break;
                case 9:
                    System.out.print(" chín");
                    break;
                default:
                    System.out.print(" ");

            }
        }
    }
}