package Model;
import Data.Menu;
import java.util.ArrayList;

public class DefaultMenuModel {
    ArrayList<Menu> menu = new ArrayList<>();

    public DefaultMenuModel() {
        adddefMenu();
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public Menu getByCode(int code){
        for (Menu m : menu){
            if (m.getCodeMenu()==code){
                return m;
            }
        }
        return null;
    }

    private void adddefMenu(){
        menu.add(new Menu(11, "Ayam Goreng + Nasi", 25000));
        menu.add(new Menu(22, "Cola", 12000));
        menu.add(new Menu(33, "Cream Soup", 16000));
        menu.add(new Menu(44, "Ice Cream", 18000));
        menu.add(new Menu(55, "Kentang", 15000));
    }

    public void cetak(){
        for(int i=0; i<menu.size(); i++){
            System.out.print("Code " + menu.get(i).getCodeMenu()+" : "+menu.get(i).getMenu()+" Rp"+menu.get(i).getHarga());
            System.out.println();
        }
    }
}
