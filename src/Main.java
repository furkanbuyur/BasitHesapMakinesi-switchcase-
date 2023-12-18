import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,islem;
        System.out.print("1. Sayıyı Girin : ");
        a = inp.nextInt();
        System.out.print("2. Sayıyı Girin : ");
        b = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapılacak İşlemi Seçin : ");
        islem = inp.nextInt();

        switch (islem){
            case 1:
                System.out.println(a+" + " + b +" = "+ (a+b));
                break;
            case 2:
                System.out.println(a+" - " + b +" = "+ (a-b));
                break;
            case 3:
                System.out.println(a+" * " + b +" = "+ (a*b));
                break;
            case 4:
                if (b == 0) {
                System.out.println("Hiçbir Sayı 0'a Bölünemez.");
                } else {
                System.out.println(a+" / " + b +" = "+ (a/b)); }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız. Yapacağınız işlemi 1 ile 4 aralığında bir değer girerek tekrar deneyin.");
            }
        }
    }
