public class App {
    public static void main(String[] args) {
        String name = "app.log";
        var logger = new Logger(name);
        logger.delete();
        logger.open();
        logger.append("system start ok!");
        logger.append("exit!");
    }
}
