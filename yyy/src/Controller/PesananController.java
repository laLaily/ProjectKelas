package Controller;

import Data.Pesanan;

import java.util.ArrayList;

public class PesananController {
    public void tambahPesanan(Pesanan p){
        AllObjModel.pesanan.tambahPesanan(p);
    }
    public void cetakPesanan(){ AllObjModel.pesanan.cetakPesanan(); }
    public ArrayList<Pesanan> getPesan(){ return AllObjModel.pesanan.getPesan(); }
}
