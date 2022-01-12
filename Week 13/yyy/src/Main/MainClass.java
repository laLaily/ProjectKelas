package Main;

import Controller.DefaultMenuController;
import Controller.KasirController;
import Controller.PesananController;
import Data.Menu;
import Data.Pesanan;
import Model.TransaksiModel;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    static Scanner scan = new Scanner(System.in);
    static DefaultMenuController defmenu = new DefaultMenuController();
    static PesananController pesan = new PesananController();
    static ArrayList<Pesanan> psn = new ArrayList<>();
    static TransaksiModel trx = new TransaksiModel();
    static KasirController kasir = new KasirController();

    public static void main(String[] args) {

        int pil;
        do{
            System.out.println("1. Pembeli \n2. Kair");
            System.out.print("Pilih:");
            pil=scan.nextInt();
            if(pil==1){
                int a;
                do{
                    System.out.println("1. Pilih Menu \n2. Lihat Pesanan");
                    System.out.print("Pilih : ");
                    a = scan.nextInt();
                    if (a==1){
                        pilihMenu();
                    }
                    else {
                        pesan.cetakPesanan();
                    }
                }while (a!=0);

            } else {
                System.out.print("ID : ");
                int id = scan.nextInt();
                System.out.print("Password : ");
                String pass = scan.next();
                if(kasir.cekLogin(id, pass) != 0){

                } else {
                    System.out.println("Id atau Password salah");
                }
            }
        }while(true);

//        KasirModel kasir = new KasirModel();
//        System.out.println(kasir.ceklogin(123,"safi"));

//        pilihMenu();
//        pesan.cetakPesanan();
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
