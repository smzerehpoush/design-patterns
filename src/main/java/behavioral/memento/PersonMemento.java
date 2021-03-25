package behavioral.memento;

public class PersonMemento {
    private String name;

    public PersonMemento(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
