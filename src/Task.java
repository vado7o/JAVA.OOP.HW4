import java.sql.Timestamp;
import java.time.LocalDate;

public class Task {
    private String article;
    private String priority;
    private int duration;
    private LocalDate deadLine;
    private String responsibility;
    private boolean notification = false;
    private String author;
    private String dateTime;

    public Task(String article, String priority, int duration, LocalDate deadLine, String responsibility, boolean notification, String author, String dateTime) {
        this.article = article;
        this.priority = priority;
        this.duration = duration;
        this.deadLine = deadLine;
        this.responsibility = responsibility;
        this.notification = notification;
        this.author = author;
        this.dateTime = dateTime;
    }

    public void setNotification() {
        if (!notification) {
            notification = true;
            System.out.println("Для события \"" + this.article + "\" оповещение включено!");
            System.out.println();
        } else {
            notification = false;
            System.out.println("Для события \"" + this.article + "\" оповещение выключено!");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        String print;
        String noty;
        if (notification) noty = "включены";
        else noty = "выключены";
        return "Задача: \"" + article + "\", автор: " + author + ", дата создания: " + dateTime + ", приоритет: " + priority + ", длительность: " + duration
                + " дней, крайний срок: " + deadLine + ", ответственный: " + responsibility + ". Оповещения: " + noty;
    }
}
