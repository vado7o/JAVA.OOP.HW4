import java.sql.Timestamp;
import java.time.LocalDate;

public class JobTasks extends Task{
    private int benefit;
    private boolean teamWork;
    public JobTasks(String article, String priority, int duration, LocalDate deadLine, String responsibility, boolean notification, int benefit, boolean teamWork,
                    String author, String dateTime) {
        super(article, priority, duration, deadLine, responsibility, notification, author, dateTime);
        this.benefit = benefit;
        this.teamWork = teamWork;
    }

    @Override
    public String toString() {
        String str;
        if (!teamWork) str = ". Вознаграждение за выполнение: " + benefit + "руб.";
        else str = ". Это командная работа! Вознаграждение каждому за выполнение: " + benefit + "руб.";
        return super.toString() + str;
    }
}
