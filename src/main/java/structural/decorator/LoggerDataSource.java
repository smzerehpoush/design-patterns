package structural.decorator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class LoggerDataSource extends DataSourceDecorator {
    public LoggerDataSource(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println(String.format("log data before write : %s", data));
        super.writeData(data);
    }

    @Override
    public String readData() {
        String str = super.readData();
        System.out.println(String.format("log data after read : %s", str));
        return str;
    }
}
