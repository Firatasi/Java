import java.util.Date;
public class Main {
    public static void main(String[] args) {
    testHesap h1 = new testHesap(1,10,3500,200000,1.24);
    h1.paraCek(2500);
    h1.paraYatir(3000);
    double[] arr = h1.aylikOdemeGetir();
    double aylikOran = arr[0];
    double aylikOdeme = arr[1];
        System.out.println("Hesap 1 nesnesi için aylık faiz oranı: " + aylikOran + " Aylık Ödeme: " + aylikOdeme + h1.getDate());
    }
}