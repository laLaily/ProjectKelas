package Data;

import java.util.ArrayList;

public class Pesanan {
    private Menu menu;
    private int jumPM ;
    private int totalhargaPM;

    public Pesanan(Menu m, int jumPm, int totalhargaPm){
        this.menu = m;
        this.jumPM = jumPm;
        this.totalhargaPM = totalhargaPm;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumPM() {
        return jumPM;
    }

    public int getTotalhargaPM() {
        return totalhargaPM;
    }
}
