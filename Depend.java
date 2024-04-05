/**
 *  D - Принцип инверсии зависимостей (Dependency Inversion Principle):
Создайте абстракцию Logger, которая будет иметь методы для логирования различных
типов сообщений. Затем создайте классы FileLogger и DatabaseLogger, реализующие 
эту абстракцию. Теперь классы, которые требуют логирования, будут зависеть только от
Logger, а не от конкретных реализаций.
 */
public class Depend {
   
}
interface Logger {

    void loggerFile();
    void loggerDataBase();
}

class FileLogger implements Logger {

    @Override
    public void loggerFile() {
    System.out.println("Сообщене записано в файл  ");

    }

    @Override
    public void loggerDataBase() {
    // не требуется реализация
        
    }   
}

class DatabaseLogger implements Logger {

    @Override
    public void loggerDataBase() {
        System.out.println("Сообщение записано в базу данных  ");
        
    }

    @Override
    public void loggerFile() {
     // не требуется реализация
        
    }   
}

class Message {
    private Logger log;
    public Message(Logger logger){
        this.log = logger;
    }
    public void sendFile(){
        log.loggerFile();
    }
    public void sendDatabase(){
        log.loggerDataBase();
    }
   
    public static void main(String[] args) {
        Message mes1 = new Message(new FileLogger());
        mes1.sendFile();
        Message mes2 = new Message(new DatabaseLogger());
        mes2.sendDatabase();
    }
}