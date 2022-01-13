package Controller;

import Data.Menu;

import java.util.ArrayList;

public class DefaultMenuController {
    public Menu getByCode(int code){
        return AllObjModel.defMenu.getByCode(code);
    }

    public void cetak(){
        AllObjModel.defMenu.cetak();
    }

    public ArrayList<Menu> getMenu(){
        return AllObjModel.defMenu.getMenu();
    }
}
