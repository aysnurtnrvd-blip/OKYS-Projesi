import java.util.ArrayList;
import java.util.List;

public class Uye extends Kullanici {
    private List<OduncKaydi> okudugumKitaplar; 

    public Uye(String id, String ad, String eposta, String sifre) {
        super(id, ad, eposta, sifre);
        this.okudugumKitaplar = new ArrayList<>();
    }

    public void oduncKaydiEkle(OduncKaydi kayit) {
        okudugumKitaplar.add(kayit);
    }
}