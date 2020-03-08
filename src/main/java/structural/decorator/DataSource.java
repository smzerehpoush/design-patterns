package structural.decorator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
