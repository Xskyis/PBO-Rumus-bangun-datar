package PBOsems2.src;

public class belahketupat {
    int sisi = 7;
    int diameter = 7;
    int hasil;
    String bentuk = "Belah ketupat";

    void rumusluas() {
        hasil = diameter*diameter/2;
        System.out.println("Hasil rumus luas belah ketupat = "+hasil);
    }
    void rumuskeliling() {
        hasil = 4*sisi;
        System.out.println("Hasil keliling belah ketupat adalah = "+hasil);
    }
    void bentuk(){
        System.out.println("Bentuk = "+bentuk);
    }
}
