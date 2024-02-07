import java.util.ArrayList;

class Thing {
    String name;

    public Thing(String name) {
        this.name = name;
    }
}

class Box {
    ArrayList<Thing> contents;

    public Box() {
        contents = new ArrayList<Thing>();
    }

    public void add(String truc) {
        Thing newThing = new Thing(truc);
        this.contents.add(newThing);
    }
}
