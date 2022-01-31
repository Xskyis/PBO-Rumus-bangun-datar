package PBOsems2.src;

public class lingkaran {
    int diameter = 10;
    int jari = 5;
    double phi = 3.14;
    double hasil;
    String bentuk = "bulet";

    void rumusluas (){
        hasil = phi*(jari*jari);
        System.out.println("Hasil luas lingkaran = "+hasil);
    }
    void rumuskeliling (){
        hasil = phi * diameter;
        System.out.println("Hasil keliling lingkaran = "+hasil);
    }
    void bentuk(){
        System.out.println("Bentuk = "+bentuk);
    }
}

