package PBOsems2.src;

public class segitigasamasisi {
    int alas = 6;
    int tinggi = 5;
    double setengah = 0.5;
    double hasil;
    String bentuk = "Lancip";

    void rumusluas() {
        hasil = setengah*alas*tinggi;
        System.out.println("Hasil luas segitiga sama sisi  = "+hasil);
    }
    void rumuskeliling() {
        hasil = 3*alas;
        System.out.println("Hasil segitiga sama sisi = "+hasil);
    }
    void bentuk(){
        System.out.println("Bentuk = "+bentuk);
    }
}
