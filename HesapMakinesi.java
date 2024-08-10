package Class1;

public class HesapMakinesi {
    public int sayi1;
    public int sayi2;
    public String renk;

    HesapMakinesi(int sayi1, int sayi2, String renk) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
        this.renk = renk;
    }

    public int topla() {
        return this.sayi1 + this.sayi2;
    }

    public int cikar() {
        return this.sayi1 - this.sayi2;
    }

    public int carp() {
        return this.sayi1 * this.sayi2;
    }

    public int bol() {
        return this.sayi1 / this.sayi2;
    }
}
