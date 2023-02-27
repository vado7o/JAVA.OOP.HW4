import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calendarr<T> {
    private List<T> tasks = new ArrayList<>();

    public Calendarr(List tasks) {

        this.tasks = tasks;
    }

    public void addTask(T someTask) {
        tasks.add(someTask);
    }

    public void removeTask(T someTask) {
        tasks.remove(someTask);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : tasks) {
            stringBuilder.append(t.toString() + "\n");
        }
        return "Календарь: \n" + stringBuilder.toString();
    }
    public void export() {
        Random rnd = new Random();
        try (FileWriter fileWriter = new FileWriter("calendar.txt", false)) {
            for (T task: tasks) {
                fileWriter.write("id " + 10000 + rnd.nextInt(90000) + task.toString() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


