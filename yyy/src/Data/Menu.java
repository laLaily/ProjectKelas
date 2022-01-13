package Data;

public class Menu {
    String menu;
    int harga;
    int codeMenu;

    public Menu(int codeMenu, String menu, int harga ) {
        this.menu = menu;
        this.harga = harga;
        this.codeMenu = codeMenu;
    }

    public String getMenu() {
        return menu;
    }

    public int getHarga() {
        return harga;
    }

    public int getCodeMenu() {
        return codeMenu;
    }
}
