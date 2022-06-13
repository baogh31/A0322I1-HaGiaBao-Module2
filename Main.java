import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int finish = 0;
        do {
            System.out.print("Nhập yêu cầu (theo Menu): ");
            int task = scanner.nextInt();
            if (task == 1) {
                System.out.print("Nhap chieu dai: ");
                int cd = scanner.nextInt();
                System.out.print("Nhap chieu rong: ");
                int cr = scanner.nextInt();
                for (int i = 1; i <= cr; i++) {
                    for (int j = 1; j <= cd; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println("Nhấn phím 4 để dừng lại");
                System.out.println("Nếu muốn tiếp tục, nhập yêu cầu (theo Menu)");
                int choice = scanner.nextInt();
                if (choice == 4) {
                    finish = 1;
                } else {
                    task = choice;
                    System.out.println("Ket thuc");
                }
            }
            if (task == 2) {
                System.out.print("Nhap canh tam giac vuong: ");
                int h = scanner.nextInt();
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                for (int i = h; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println("Nhấn phím 4 để dừng lại");
                System.out.println("Nếu muốn tiếp tục, nhập yêu cầu (theo Menu)");
                int choice = scanner.nextInt();
                if (choice == 4) {
                    finish = 1;
                } else {
                    task = choice;
                    System.out.println("Ket thuc");
                }
            }
            if (task == 3) {
                System.out.println("Nhap chieu cao tam giac can");
                int h = scanner.nextInt();
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= h - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println("Nhấn phím 4 để dừng lại");
                System.out.println("Nếu muốn tiếp tục, nhập yêu cầu (theo Menu)");
                int choice = scanner.nextInt();
                if (choice == 4) {
                    finish = 1;
                    System.out.println("Ket thuc");
                } else {
                    task = choice;
                }
            }
            if (task == 4) {
                System.out.println("Ket thuc ");
                break;
            }

        }
        while (finish != 1);
    }
}
