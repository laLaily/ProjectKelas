package Controller;
import Model.KasirModel;

public class KasirController
{
    public int cekLogin (int id, String pass){
        return AllObjModel.kasir.ceklogin(id, pass);
    }
}
