import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- OKYS Sistemi Başlatılıyor ---\n");

        Uye uye1 = new Uye("U001", "Eren Yılmaz", "eren@email.com", "sifre123");

        Kitap kitap1 = new Kitap("975-111", "Yüzüklerin Efendisi", "Tolkien", 1954, "Rafta");
        KitapKopyasi kopya1 = new KitapKopyasi("BRK-1001", kitap1);

        Date bugun = new Date();
        OduncKaydi kayit1 = new OduncKaydi("ISL-01", uye1, kopya1, bugun, bugun);

        kayit1.islemDetayiYazdir();
        System.out.println("\n-Kayıt başarıyla oluşturuldu-");
    }
}