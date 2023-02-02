package application.console.concretes;

import java.util.Scanner;

public class Start {

    public static void start(){

        Scanner inp = new Scanner(System.in);

        int select;

        do {
            System.out.println("========== DEVKENT HASTANE UYGULAMAMIZA HOSGELDINIZ ==========\n");
            System.out.println("1-Doktor Menü Seçimi");
            System.out.println("2-Hasta Menü Seçimi");
            System.out.println("0-Çıkış");

            select = inp.nextInt();

            switch (select){
                case 1:
                    //doktor
                    break;
                case 2:
                    //hasta
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
                    break;
            }

        }while(select != 0);

        System.out.println("İyi günler, sağlıklı günler dileriz...");
    }

}