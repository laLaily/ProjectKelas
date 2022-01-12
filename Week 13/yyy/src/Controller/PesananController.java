package Controller;

import Data.Pesanan;

public class PesananController {
    public void tambahPesanan(Pesanan p){
        AllObjModel.pesanan.tambahPesanan(p);
    }
    public void cetakPesanan(){
        AllObjModel.pesanan.cetakPesanan();
    }
}
