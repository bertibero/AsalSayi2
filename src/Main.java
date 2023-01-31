import java.util.Scanner;

public class Main {
    static void asal(int n){
        int sayac = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(n + " Asal bir sayıdır.");
        } else {
            System.out.println(n + " Asal bir sayı değildir.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int n = input.nextInt();
        asal(n);
    }
}