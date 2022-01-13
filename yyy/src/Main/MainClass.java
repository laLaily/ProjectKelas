package Main;

import Controller.DefaultMenuController;
import Controller.KasirController;
import Controller.PesananController;
import Controller.TransaksiController;
import Data.Menu;
import Data.Pesanan;
import Data.Transaksi;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    static ArrayList<ArrayList<Pesanan>> listPesan = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static DefaultMenuController defmenu = new DefaultMenuController();
    static PesananController pesan = new PesananController();
    static TransaksiController trx = new TransaksiController();
    static KasirController kasir = new KasirController();
    static int i = 1;

    public static void main(String[] args) {
        int pil;
        int ctr = 0;
        do {
            System.out.println("1. Pembeli \n2. Kasir");
            System.out.print("Pilih : ");
            pil = scan.nextInt();
            if (pil == 1) {
                int a;
                do {
                    System.out.println("1. Pilih Menu \n2. Lihat Pesanan \n0. logout");
                    System.out.print("Pilih : ");
                    a = scan.nextInt();
                    switch (a) {
                        case 1:
                            pilihMenu();
                            break;
                        case 2:
                            pesan.cetakPesanan();
                            break;
//                        default :
//                            System.out.println("pilihan tiak ada");
                    }
                } while (a != 0);
            } else {
                System.out.print("ID : ");
                int id = scan.nextInt();
                System.out.print("Password : ");
                String pass = scan.next();
                if (kasir.cekLogin(id, pass) != 0) {
//                    pesan.cetakPesanan();
                    trx.cetakTransaksi();
                } else {
                    System.out.println("Id atau Password salah");
                }
            }
        } while (true);

    }

    public static void pilihMenu(){
        ArrayList<Pesanan> psn = new ArrayList<>();
        defmenu.cetak();

        int hargaTotal = 0;
        String a="y";
        do{
            System.out.print("Masukan Kode Menu : ");
            int code = scan.nextInt();
            System.out.print("Masukkan Jumlah Menu : ");
            int banyak = scan.nextInt();
            int totalharga = banyak * defmenu.getByCode(code).getHarga();
            pesan.tambahPesanan(new Pesanan(defmenu.getByCode(code),banyak,totalharga));
            psn.add(new Pesanan(defmenu.getByCode(code),banyak,totalharga));
            hargaTotal = hargaTotal + totalharga;
            System.out.print("Pilih menu lain ?(y/n) ");
            a = scan.next();
        }while(a.equals("y"));
        trx.tambahTrx(new Transaksi(psn,hargaTotal,i));
        i++;
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
//            for(int i=0; i< psn.size(); i++){
//                if(pesan.getPesan().get(i).getId()==code){
//
//                } else {
//
//                }
//            }