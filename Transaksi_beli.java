import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Syifa Solihat on 4/12/2017.
 */
public class Transaksi_beli {
    String kd_trans_beli;
    String tgl_transaksi;
    String nik;
    String kd_supplier;

    HashMap<String,Transaksi_beli> hmtrans_beli = new HashMap<>();


    public Transaksi_jual(String kd_trans_beli, String tgl_transaksi, String nik, String kd_supplier) {
        this.kd_trans_beli = kd_trans_beli;
        this.tgl_transaksi = tgl_transaksi;
        this.nik = nik;
        this.kd_supplier = kd_supplier;
    }


    public void addTransBeli(Transaksi_beli tb) {
        hmtrans_beli.put(tb.kd_trans_beli,tb);
    }


    public void print() {
        System.out.println("== Minimarket ===");
        for (Transaksi_beli tb :hmtrans_beli.values()) {
            System.out.println("Kode Transaksi  :"+kd_trans_beli);
            System.out.println("NIK :"+nik);
            System.out.println("Tanggal Transaksi :"+tgl_transaksi);
            System.out.println("Kode Supplier :"+kd_supplier);
        }
    }

    public void hapusTransaksi(String kd_hapus){
        hmtrans_beli.remove(kd_hapus);
    }

    public static void main(String[] args) {
        Transaksi_beli tb = new Transaksi_beli("1", "Twiska","23 Agustus 2016" "TA23");
        tb.addTransBeli(tb);
        tb.print();
        tb.hapusTransaksi("1");
        tb.print();
    }
}
