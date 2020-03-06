package creational.prototype;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public abstract class Shape implements Cloneable {
    private String id;
    private ShapeType type;

    public Shape(ShapeType type, String id) {
        this.type = type;
        this.id = id;
    }

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
