import java.time.LocalDate;

public class HomeTask extends Task{
    boolean familyTask;
    int expenses;
    public HomeTask(String article, String priority, int duration, LocalDate deadLine, String responsibility, boolean notification, boolean familyTask,
                    int expenses, String author, String dateTime) {
        super(article, priority, duration, deadLine, responsibility, notification, author, dateTime);
        this.familyTask = familyTask;
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        String str;
        if (!familyTask) str = ". Затраты на выполнение задачи составят: " + expenses + "руб.";
        else str = ". Это задача для ВСЕЙ семьи. Затраты на выполнение задачи составят: " + expenses + "руб.";
        return super.toString() + str;
    }
}
