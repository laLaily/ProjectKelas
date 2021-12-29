package Model;
import Data.Menu;
import java.util.ArrayList;

public class DefaultMenuModel {
    ArrayList<Menu> menu;
    private void adddefMenu(){
        menu.add(new Menu(185, "pitik", 10000));
        menu.add(new Menu(186, "bebek", 40000));
        menu.add(new Menu(187, "sapi", 50000));
        menu.add(new Menu(188, "babi", 60000));
        menu.add(new Menu(189, "telur", 30000));
    }
}
