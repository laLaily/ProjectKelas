package Model;

import Data.Pesanan;
import java.util.ArrayList;

public class PesananModel {
    protected ArrayList<Pesanan> pesan = new ArrayList<>();

    public void tambahPesanan(Pesanan p){
        pesan.add(p);
    }

    public void cetakPesanan(){
        for(int i=0; i< pesan.size(); i++){
            //System.out.println(pesan.get(i).getId() + " ");
            System.out.print(pesan.get(i).getMenu().getCodeMenu() + ", ");
            System.out.print(pesan.get(i).getMenu().getMenu() + ", Harga Rp");
            System.out.print(pesan.get(i).getMenu().getHarga() + ", Jumlah ");
            System.out.print(pesan.get(i).getJumPM() + ", Total Harga Rp");
            System.out.print(pesan.get(i).getTotalhargaPM());
            System.out.println();
        }
    }


    public ArrayList<Pesanan> getPesan() {
        return pesan;
    }
}
