import java.util.Date;

public class OduncKaydi {
    private String islemNo;
    private Date oduncTarihi;
    private Date sonTeslimTarihi;
    private Date teslimTarihi;
    
    private Uye uye; 
    private KitapKopyasi kopya; 

    public OduncKaydi(String islemNo, Uye uye, KitapKopyasi kopya, Date oduncTarihi, Date sonTeslimTarihi) {
        this.islemNo = islemNo;
        this.uye = uye;
        this.kopya = kopya;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        
        uye.oduncKaydiEkle(this);
        kopya.oduncKaydiEkle(this);
    }

    public void islemDetayiYazdir() {
        System.out.println("İşlem No: " + islemNo);
        System.out.println("Üye Adı: " + uye.getAd());
        System.out.println("Kitap: " + kopya.getKitap().getBaslik() + " (Barkod: " + kopya.getBarkod() + ")");
    }
}