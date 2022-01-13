package Data;

public class Kasir {
    private String nama;
    private int id;
    private String password;

    public Kasir(String nama, int id, String password) {
        this.nama = nama;
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public String getPass() {return password; }
}
