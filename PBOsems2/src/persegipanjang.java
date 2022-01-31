package PBOsems2.src;

public class persegipanjang {
    int panjang = 4;
    int lebar = 5;
    int hasil;
    String bentuk = "Kotak panjang";

    void rumusluas() {
        hasil = panjang *lebar;
        System.out.println("Hasil luas persegi panjang adalah = "+hasil);
    }
    void rumuskeliling() {
        hasil = 2*(panjang+lebar);
        System.out.println("Hasil keliling persegipanjang adalah = "+hasil);
    }
    void bentuk(){
        System.out.println("Bentuk = "+bentuk);
    }
    
}