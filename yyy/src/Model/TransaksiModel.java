package Model;

import Controller.KasirController;
import Data.Pesanan;
import Data.Transaksi;

import java.util.ArrayList;
import java.util.Date;

public class TransaksiModel {
    PesananModel pesan = new PesananModel();
    KasirController kasir = new KasirController();
    ArrayList<Transaksi> trx = new ArrayList<>();
    protected ArrayList<Pesanan> pesanan = new ArrayList<>();

    public Pesanan ambilPesanan(int id){
        for (int i=0;i<pesan.getPesan().size();i++) {
            if (pesan.getPesan().get(i).getId()==id){
                return pesan.getPesan().get(i);
            }
        }
        return null;
    }

    public void tambahTrx(Transaksi t){
        trx.add(t);
    }

    public void cetakTransaksi(int noTrx){
        for(int i=0;i<trx.size();i++){
            if(trx.get(i).getNoTRX()==noTrx){
                System.out.println("nomor transaksi = "+trx.get(i).getNoTRX());
                for(int j=0;j<trx.get(i).getPesan().size();j++){
                    System.out.println(trx.get(i).getPesan().get(j).getMenu().getMenu());
                    System.out.println(trx.get(i).getPesan().get(j).getMenu().getHarga());
                    System.out.println(trx.get(i).getPesan().get(j).getTotalhargaPM());
                    System.out.println(trx.get(i).getPesan().get(j).getJumPM());
                }
                System.out.println("harga total = "+trx.get(i).getHargaTotal());
            }
        }
    }

    public void cetakTransaksi(){
        for(int i=0;i<trx.size();i++){
            System.out.println("============================");
               System.out.println("Nomor Transaksi = "+trx.get(i).getNoTRX());
            System.out.println("Daftar Pesanan : ");
                for(int j=0;j<trx.get(i).getPesan().size();j++){
                    System.out.println("Pesanan ke-"+(j+1));
                    System.out.println("Menu   = "+trx.get(i).getPesan().get(j).getMenu().getMenu());
                    System.out.println("Harga  = "+trx.get(i).getPesan().get(j).getMenu().getHarga());
                    System.out.println("Total  = "+trx.get(i).getPesan().get(j).getTotalhargaPM());
                    System.out.println("Jumlah = "+trx.get(i).getPesan().get(j).getJumPM());
                }
                System.out.println("TOTAL = "+trx.get(i).getHargaTotal());
        }

    }
}
