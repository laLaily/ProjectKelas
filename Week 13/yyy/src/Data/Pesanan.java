package Data;

import java.util.ArrayList;

public class Pesanan {
    Menu menu;
    int jumPM ;
    int totalhargaPM;
    int hargaSemua;

    public Pesanan(Menu m, int jumPm, int totalhargaPm, int hargasemua){
        this.menu = m;
        this.jumPM = jumPm;
        this.totalhargaPM = totalhargaPm;
        this.hargaSemua = hargasemua;
    }

}
