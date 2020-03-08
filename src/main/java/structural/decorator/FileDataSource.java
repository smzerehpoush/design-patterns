package structural.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String input) {
        File file = new File(fileName);
        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(input.getBytes(StandardCharsets.UTF_8), 0, input.getBytes(StandardCharsets.UTF_8).length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(fileName);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
