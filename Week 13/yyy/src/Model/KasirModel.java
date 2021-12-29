package Model;
import Data.Kasir;
import java.util.ArrayList;

public class KasirModel {
    ArrayList<Kasir> datakasir;

    public void addKasir(Kasir baru){
        datakasir.add(baru);
    }

    public void delKasir(int id){
        for (Kasir a : datakasir) {
            if(a.getId()==id){
                datakasir.remove(getIndex(id));
            }
        }
    }

    private int getIndex(int id){
        for (Kasir a : datakasir) {
            if(a.getId()==id){
                return datakasir.indexOf(a);
            }
        }
    }
}
