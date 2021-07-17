import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private String name;
    private FileWriter fileWriter;

    Logger(String name) {
        this.name = name;
    }

    void open() {
        try {
            var file = new File(this.name);
            if (file.createNewFile()) {
                System.out.println(this.name + " created successfully!");
            } else {
                System.out.println(this.name + " already exist!");
            }
            file.setWritable(true);
            fileWriter = new FileWriter(this.name, false);
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    boolean append(String msg) {
        try {
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
            msg = "[" + dateTime.format(formatter) + "]" + msg + "\n";
            fileWriter.append(msg);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return true;
    }

    void delete() {
        File file = new File(this.name);
        file.delete();
    }
}
