package Data;

import java.util.ArrayList;

public class Transaksi {
    protected ArrayList<Pesanan> pesan = new ArrayList<>();
    protected int hargaTotal;
    protected int noTRX;

    public Transaksi(ArrayList<Pesanan> pesan, int hargaTotal, int noTRX) {
        this.pesan = pesan;
        this.hargaTotal = hargaTotal;
        this.noTRX = noTRX;
    }

    public ArrayList<Pesanan> getPesan() {
        return pesan;
    }

    public void setPesan(ArrayList<Pesanan> pesan) {
        this.pesan = pesan;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public int getNoTRX() {
        return noTRX;
    }

    public void setNoTRX(int noTRX) {
        this.noTRX = noTRX;
    }
}