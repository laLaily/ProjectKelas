package Data;

public class Pesanan {
    private int id;
    private Menu menu;
    private int jumPM ;
    private int totalhargaPM;

    public Pesanan(Menu m, int jumPm, int totalhargaPm){
        this.menu = m;
        this.jumPM = jumPm;
        this.totalhargaPM = totalhargaPm;
    }

    public Pesanan(int id, Menu menu, int jumPM, int totalhargaPM) {
        this.id = id;
        this.menu = menu;
        this.jumPM = jumPM;
        this.totalhargaPM = totalhargaPM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
