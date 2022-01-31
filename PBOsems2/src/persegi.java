package PBOsems2.src;

public class persegi {
    int sisi = 10;
    int hasil;
    String bentuk = "Kotak";

    void rumusluas() {
        hasil = sisi*sisi;
        System.out.println("Hasil luas persegi adalah = "+hasil);
    }
    void rumuskeliling() {
        hasil = 4*sisi;
        System.out.println("Hasil keliling persegi adalah = "+hasil);
    }
    void bentuk(){
        System.out.println("Bentuk = "+bentuk);
    }
    
}