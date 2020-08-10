package creational.prototype;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Shape {
    private String id;
    private int width;
    private int height;

    public Shape(String id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    public Shape(Shape shape) {
        this(shape.getId(), shape.getWidth(), shape.getHeight());
    }

    public String getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request{");
        sb.append("id='").append(id).append('\'');
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
