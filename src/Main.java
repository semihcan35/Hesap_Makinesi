import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim,number1,number2;
        System.out.println("İlk sayıyı giriniz:");
        number1=input.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        number2=input.nextInt();
        System.out.println("Gerçekleştirmek istediğiniz işlemi seçiniz:");
        System.out.println(" 1-Toplama\n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        secim=input.nextInt();

        switch(secim){
            case 1:
                System.out.println("Sonuç ="+ (number1+number2));
                break;
            case 2:
                System.out.println("Sonuç ="+ (number1-number2));
                break;
            case 3:
                System.out.println("Sonuç ="+ (number1*number2));
                break;
            case 4:
                System.out.println("Sonuç ="+ (number1/number2));
                break;

        }
    }
}