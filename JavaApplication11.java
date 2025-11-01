import java.util.Scanner;

public class JavaApplication11 {

    public static void main (String[] args) {
        Scanner input = new Scanner (System. in);


        System.out.println("==Daftar Benda==");
        System.out.println("1. Pena\t: Rp.15.000");
        System.out.println("2. Buku\t: Rp.10.000");
        System.out.println("3. Pen\t: Rp.3.000");
        System.out.println("4. Tas\t: Rp.150.000");

        System.out.println("\nMasukkan barang pilihan: ");
        int pilih= input.nextInt ();
        
        String barang = "";
        int harga = 0;
        double diskon = 0.0;
        double HargaAkhir = 0.0;

        if(pilih==1) {
           barang= "pena";
           harga= 15000;
           diskon= 0.10;
        }else if(pilih==2) {
            barang= "buku";
            harga= 10000;
            diskon= 0.05;
        }else if(pilih==3) {
                barang= "pen";
                harga= 3000;
                diskon= 0.02;
        }else if(pilih==4) {
                barang= "tas";
                harga= 150000;
                diskon= 0.5;
        }else{
        barang= "barang tidak tersedia";
        }
        System.out.println("anda memilih: " + barang);
        System.out.println("harga\t\t: " + harga);

    HargaAkhir= harga - (harga*diskon);

    System.out.println("\nBarang yang dipilih: " + barang);
    System.out.println("harga sebelum diskon:Rp " + harga);
    System.out.println("diskon: " + (diskon*100) + "%");
    System.out.println("Harga setelah diskon:Rp " + HargaAkhir);

        input.close();
    }

}