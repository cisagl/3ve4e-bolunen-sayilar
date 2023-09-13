import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        int ort = toplam / sayac;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ort);
    }
}