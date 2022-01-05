package Model;
import Data.Kasir;
import java.util.ArrayList;

public class KasirModel {
    ArrayList<Kasir> datakasir = new ArrayList<>() ;

    public KasirModel() { anggota(); }

    private void anggota(){
        datakasir.add(new Kasir ("Mitha", 123, "mitha"));
        datakasir.add(new Kasir ("Tasya", 456, "tasya"));
        datakasir.add(new Kasir ("Safi", 789, "safi"));
        datakasir.add(new Kasir ("Laily", 185, "laily"));
    }

    public int ceklogin (int id, String pass){
        for (Kasir a : datakasir){
            if(a.getId()==id && a.getPass().equals(pass)){
                return id;
            }
        }
        return 0;
    }

}
