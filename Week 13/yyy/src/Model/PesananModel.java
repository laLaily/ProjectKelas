package Model;

import Data.Pesanan;
import java.util.ArrayList;

public class PesananModel {
    ArrayList<Pesanan> pesan = new ArrayList<>();

    public void tambahPesanan(Pesanan p){
        pesan.add(p);
    }

    public void cetakPesanan(){
        for(int i=0; i< pesan.size(); i++){
            System.out.print(pesan.get(i).getMenu().getCodeMenu() + " ");
            System.out.print(pesan.get(i).getMenu().getMenu() + " ");
            System.out.print(pesan.get(i).getMenu().getHarga() + " ");
            System.out.print(pesan.get(i).getJumPM() + " ");
            System.out.print(pesan.get(i).getTotalhargaPM());
            System.out.println();
        }
    }


}
