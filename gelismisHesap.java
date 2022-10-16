import java.util.Scanner;
public class gelismisHesap {

    static void sum(int a, int b){
        System.out.println("Sonuç : " + (a+b));
    }
    static void minus(int a, int b){
        System.out.println("Sonuç : " + (a-b));
    }
    static void times(int a, int b){
        System.out.println("Sonuç : " + (a*b));
    }
    static void divide(int a, int b){
        System.out.println("Sonuç : " + (a/b));
    }
    static void power(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        System.out.println("Sonuç : " + result);
    }
    static void mod(int a, int b){
        System.out.println("Sonuç : " + (a%b));
    }
    static void calan(int a, int b){
        System.out.println("Çevre : " + (2*(a+b)));
        System.out.println("Alan : " + a*b);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String menu = "1) Toplama\n"
                + "2) Çıkarma\n"
                + "3) Çarpma\n"
                + "4) Bölme\n"
                + "5) Üs Alma\n"
                + "6) Mod Alma\n"
                + "7) Dikdörtgen Alan ve Çevresi\n"
                + "0) Çıkış";

        System.out.println(menu);

        while(true){

            System.out.print("Bir İşlem Seçiniz : ");
            int select = s.nextInt();

            if(select==0) {
                break;
            }

            System.out.print("İlk Sayı : ");
            int a = s.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = s.nextInt();

            switch(select){

                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if(b==0){
                        System.out.println("İkinci sayı 0'dan farklı olmalı! ");
                    } else{
                    divide(a,b);}
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calan(a,b);
                    break;
            }

        }
        System.out.println("Güle Güle!");
    }
}
