package donguler;

import java.util.Scanner;

public class UcDort {
    public static void main(String[] args) {
        int sayi, index=0, toplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        for (int i=1; i<sayi; i++){
            if(i%3==0 && i%4==0){
                System.out.print(i + " ");
                toplam += i;
                index++;
            }
        }
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4 ile bölünebilen sayıların ortalaması: " +
                (toplam/index) );
    }
}
