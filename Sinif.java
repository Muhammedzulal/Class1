package Class1;

public class Sinif {
    public static void main(String[] args) {
        HesapMakinesi m1 = new HesapMakinesi(10, 2, "siyah");
        System.out.println("Toplam: " + m1.topla());
        System.out.println("Çıkarma:" + m1.cikar());
        m1.sayi1 = 20;
        System.out.println("Çarpma: " + m1.carp());
        System.out.println("Bölme: " + m1.bol());
        // -----------------------------------------------------
        HesapMakinesi m2 = new HesapMakinesi(20, 5, "beyaz");
        System.out.println("Toplam: " + m2.topla());
        System.out.println("Çıkarma:" + m2.cikar());
        m2.sayi1 = 60;
        System.out.println("Çarpma: " + m2.carp());
        System.out.println("Bölme: " + m2.bol());
    }
}
