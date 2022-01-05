package Model;
import Data.Menu;
import java.util.ArrayList;

public class DefaultMenuModel {
    ArrayList<Menu> menu = new ArrayList<>();

    public DefaultMenuModel() {
        adddefMenu();
    }

    private void adddefMenu(){
        menu.add(new Menu(185, "pitik", 10000));
        menu.add(new Menu(186, "bebek", 40000));
        menu.add(new Menu(187, "sapi", 50000));
        menu.add(new Menu(188, "babi", 60000));
        menu.add(new Menu(189, "telur", 30000));
    }

    public void cetak(){
        for(int i=0; i<menu.size(); i++){
            System.out.print("Code " + menu.get(i).getCodeMenu()+" : "+menu.get(i).getMenu()+" "+menu.get(i).getHarga());
            System.out.println();
        }
    }
}
