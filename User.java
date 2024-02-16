import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private List<Box> boxs;

    public User(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        List<Box> boxs = new ArrayList<>();
    }

    public void ajoute(Box ne){
        Box nouvo = new Box(ne);
        boxs.add(nouvo);
    }
}
