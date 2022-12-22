import java.util.Scanner;

public class Main {
    static int sayac = 0;
    static boolean isAsal(int number, int i){

        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number == i) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return isAsal(number, i + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        /*int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }*/
        boolean sd = isAsal(sayi,2);
        if( sd) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
}
