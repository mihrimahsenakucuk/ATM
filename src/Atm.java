import java.util.Scanner;

public class Atm {

    public void calis(Hesap hesap) {
        Giris giris = new Giris();

        Scanner scan = new Scanner(System.in);
        System.out.println("Bankamıza Hoş Geldiniz");

        System.out.println("*********************");

        System.out.println("Kullanıcı Girişi");

        System.out.println("*********************");

        int giris_hakki= 3;

        while(true) {
            if(giris.giris(hesap)) {

                System.out.println("Giriş Başarılı...");
                break;
            }

            else {
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkınız: " + giris_hakki);
            }

            if(giris_hakki == 0 ) {
                System.out.println("Giriş hakkınız bitti");
                return ;
            }


        }

        System.out.println("*************");
        String islemler= "1.Bakiye Görüntüle \n"
                +"2.Para Yatırma \n"
                +"3.PAra Çekme \n"
                +"Çıkış Yapmak İçin Q'ya Basınız" ;

        System.out.println(islemler);



        while(true) {
            System.out.println("İşleminizi seçiniz: ");
            String islem= scan.nextLine();

            if(islem.equals("Q")) {

                break;

            }else if(islem.equals("1")) {
                System.out.println(hesap.GetBakiye());

            }else if(islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar= scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);

            }else if(islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutarı girinz: ");
                int tutar= scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            }

            else {
                System.out.println("Geçersiz İşlem....");
            }


        }




    }

}
