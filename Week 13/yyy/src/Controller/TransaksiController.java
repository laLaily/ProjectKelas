package Controller;

import Data.Transaksi;

public class TransaksiController {
    public void insert(Transaksi t){
        AllObjModel.transaksi.tambahTrx(t);
    }

    public void cetakData(int noTrx){
        AllObjModel.transaksi.cetakTransaksi(noTrx);
    }
}
