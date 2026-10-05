# Online Kütüphane Yönetim Sistemi (OKYS)

Bu proje, **Online Kütüphane Yönetim Sistemi (OKYS)** gereksinimleri ve **Nesne Yönelimli Programlama (OOP)** ilkeleri doğrultusunda geliştirilmiştir.

## Proje Yapısı

- **`doc/`**: Use Case, Class diyagramları ve SRS dokümanlarını içerir.
- **`src/`**: Projenin Java sınıflarını ve test kodlarını içerir.

##  Nesne Yönelimli Programlama (OOP) Prensipleri
- **Kalıtım (Inheritance):** `Uye` ve `KutuphaneGorevlisi` sınıfları `Kullanici` sınıfından türetilmiştir (`extends`).
- **Kapsülleme (Encapsulation):** Tüm sınıf nitelikleri `private`/`protected` erişim belirteçleri ile korunmuştur.
- **İlişkiler (Association):** `Kitap` ile `KitapKopyasi` arasında `1..*` ilişki kurulmuş; `OduncKaydi` ile nesneler birbirine bağlanmıştır.
- **Dinamik Veri Yapıları:** Liste tutan tüm ilişkilerde `ArrayList` kullanılmıştır.

##  Çalıştırma
`src/Main.java` dosyası çalıştırılarak nesnelerin üretilmesi ve sistem testi gerçekleştirilir.
