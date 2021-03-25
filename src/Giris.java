import java.util.Scanner;

public class Giris {

    public boolean giris(Hesap hesap) {

        Scanner scan= new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("Kullanıcı adı:");
        kullanici_adi= scan.nextLine();
        System.out.println("Parola: ");
        parola= scan.nextLine();

        if(hesap.GetKullanici_adi().equals(kullanici_adi) && hesap.GetParola().equals(parola)) {

            return true;
        }else {

            return false;
        }
    }
}
