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
        menu.add(new Menu(11, "Masker", 20000));
        menu.add(new Menu(22, "Skincare", 70000));
        menu.add(new Menu(33, "Ciki", 1000));
        menu.add(new Menu(44, "Parfum", 55000));
        menu.add(new Menu(55, "tisu", 12000));
    }

    public void cetak(){
        for(int i=0; i<menu.size(); i++){
            System.out.print("Code " + menu.get(i).getCodeMenu()+" : "+menu.get(i).getMenu()+" Rp"+menu.get(i).getHarga());
            System.out.println();
        }
    }
}
