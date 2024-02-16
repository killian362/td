import org.junit.*;

public class TestsBoxes {
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }

    /** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd() {
        Box b = new Box();
        b.add("truc1");
        b.add("truc2");
    }

    @Test
    public void testUser() {
        User soi = new User(456, "Larue", "Lavrai");
        Box b = new Box();
        soi.ajoute(b);
        b.add("machin");
        b.add("lope");
        
    }
}