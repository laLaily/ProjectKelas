package Controller;

import Data.Transaksi;

public class TransaksiController {

    public void cetakData(int noTrx){
        AllObjModel.transaksi.cetakTransaksi(noTrx);
    }

    public void tambahTrx(Transaksi t){ AllObjModel.transaksi.tambahTrx(t);}

    public void cetakTransaksi(){
        AllObjModel.transaksi.cetakTransaksi();
    }
}
