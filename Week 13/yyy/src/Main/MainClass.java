package Main;

import Model.DefaultMenuModel;
import Model.KasirModel;

import java.util.Scanner;

public class MainClass {
    static Scanner scan = new Scanner(System.in);
    static DefaultMenuModel defmenu = new DefaultMenuModel();


    public static void main(String[] args) {

//        KasirModel kasir = new KasirModel();
//        System.out.println(kasir.ceklogin(123,"safi"));

        pilihMenu();
    }

    public static void pilihMenu(){
        defmenu.cetak();
        String a="y";
        do{

            System.out.print("Masukan Kode Menu Pilihan :  ");
            int code = scan.nextInt();
            System.out.print("Banyak: ");
            int banyak = scan.nextInt();
            
            System.out.print("Pilih menu lain (y/n)?");
            a = scan.next();
        }while(a.equals("y"));
    }


}
