package Main;

import Data.Menu;
import Data.Pesanan;
import Data.Transaksi;
import Model.DefaultMenuModel;
import Model.KasirModel;
import Model.PesananModel;
import Model.TransaksiModel;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    static Scanner scan = new Scanner(System.in);
    static DefaultMenuModel defmenu = new DefaultMenuModel();
    static PesananModel pesan = new PesananModel();
    static ArrayList<Pesanan> psn = new ArrayList<>();
    static TransaksiModel trx = new TransaksiModel();

    public static void main(String[] args) {

//        KasirModel kasir = new KasirModel();
//        System.out.println(kasir.ceklogin(123,"safi"));

        pilihMenu();
        pesan.cetakPesanan();
//        defTrx();
//        trx.cetakTransaksi(1);

    }

//    static void defTrx(){
//        int totalharga = 20 * defmenu.getByCode(185).getHarga();
//        psn.add(new Pesanan(defmenu.getByCode(185),20,totalharga));
//        int totalharga2 = 20 * defmenu.getByCode(186).getHarga();
//        psn.add(new Pesanan(defmenu.getByCode(186),20,totalharga2));
//        int totalharga3 = 20 * defmenu.getByCode(187).getHarga();
//        psn.add(new Pesanan(defmenu.getByCode(187),20,totalharga3));
//        int hargaTotal = totalharga3+totalharga2+totalharga;
//        trx.tambahTrx(new Transaksi(psn,hargaTotal,1));
//    }

    public static void pilihMenu(){
        defmenu.cetak();
        String a="y";
        do{
            System.out.print("Masukan Kode Menu Pilihan :  ");
            int code = scan.nextInt();
            System.out.print("Banyak: ");
            int banyak = scan.nextInt();
            int totalharga = banyak * defmenu.getByCode(code).getHarga();
            pesan.tambahPesanan(new Pesanan(defmenu.getByCode(code),banyak,totalharga));
            System.out.print("Pilih menu lain (y/n)?");
            a = scan.next();
        }while(a.equals("y"));
    }

    private int getIndex(int code){
        for(Menu m : defmenu.getMenu()){
            if(m.getCodeMenu()==code){
                return defmenu.getMenu().indexOf(m);
            }
        }
        return 0;
    }
}
