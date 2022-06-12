package chuyendoitiente;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer rate= 23000;
        System.out.print("$: ");
        Float usd= scanner.nextFloat();
        System.out.println("VND: "+usd*rate);
    }
}
