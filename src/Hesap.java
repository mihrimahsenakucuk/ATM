public class Hesap {

    private String kullanici_adi ;
    private String parola ;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi= kullanici_adi;
        this.parola= parola;
        this.bakiye= bakiye;
    }




    public String GetKullanici_adi() {
        return kullanici_adi;
    }

    public void SetKullanici_adi(String kullanici_adi) {
        this.kullanici_adi= kullanici_adi;
    }

    public String GetParola() {
        return parola;
    }

    public void SetParola(String parola) {
        this.parola= parola;
    }

    public int GetBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye= bakiye;
    }

    public void paraYatir(int tutar) {

        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    public void paraCek(int tutar) {
        if((bakiye - tutar) < 0 ) {
            System.out.println("Yeterli bakiyeniz yoktur.");
        }else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }



}
