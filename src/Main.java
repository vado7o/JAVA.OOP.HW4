import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        JobTasks doReport = new JobTasks("Составить отчёт", "высокий", 3, LocalDate.of(2023, 3, 2), "технолог",
                false, 35000, false, "Сергей Иванов", "12/11/2022");

        JobTasks supplyRequest = new JobTasks("Создать заявку на МТР", "средний", 10, LocalDate.of(2023, 5, 5),
                "управление материального обеспечения", false, 1000000, true, "Пётр Петров", "10/09/2022");

        JobTasks celebrate = new JobTasks("Поздравить коллектив с Новым Годом", "средний", 1, LocalDate.of(2023, 12, 31),
                "Я", false, 0, false, "Иван Дуров", "01/03/2022");

        HomeTask maintainSauna = new HomeTask("Смонтировать сауну", "низкий", 180, LocalDate.of(2023, 12, 31),
                "Я", false, false, 150000, "Сергей Оверко", "03/04/2022");
        HomeTask brushWalls = new HomeTask("Покрасить стены", "средний", 14, LocalDate.of(2023, 10, 10),
                "все члены семьи", false, true, 10000, "Игорь Горн", "05/09/2022");
        HomeTask doExercices = new HomeTask("Делать зарядку", "высокий", 365, LocalDate.of(2023, 12, 31),
                "вся семья", false, true, 0, "Никита Самойлов", "22/07/2022");

        System.out.println(doReport);
        System.out.println("----------------------------------------------------------------");
        System.out.println(supplyRequest);
        System.out.println("----------------------------------------------------------------");
        System.out.println(celebrate);
        System.out.println("----------------------------------------------------------------");
        System.out.println(maintainSauna);
        System.out.println("----------------------------------------------------------------");
        System.out.println(brushWalls);
        System.out.println("----------------------------------------------------------------");
        System.out.println(doExercices);
        System.out.println("----------------------------------------------------------------");

        doReport.setNotification();        // включаем оповещения
        System.out.println("----------------------------------------------------------------");
        doExercices.setNotification();
        System.out.println("----------------------------------------------------------------");
        System.out.println(doReport);
        System.out.println("----------------------------------------------------------------");
        System.out.println(doExercices);
        System.out.println("----------------------------------------------------------------");

        doExercices.setNotification();     // выключаем оповещения
        System.out.println("----------------------------------------------------------------");
        System.out.println(doExercices);
        System.out.println("----------------------------------------------------------------");

        Calendarr<JobTasks> jobTasksCalendarr = new Calendarr<>(new ArrayList());
        Calendarr<HomeTask> homeTaskCalendarr = new Calendarr<>(new ArrayList());

        jobTasksCalendarr.addTask(doReport);
        jobTasksCalendarr.addTask(supplyRequest);
        jobTasksCalendarr.addTask(celebrate);
        System.out.println(jobTasksCalendarr);
        jobTasksCalendarr.export();
        System.out.println("----------------------------------------------------------------");

        homeTaskCalendarr.addTask(maintainSauna);
        homeTaskCalendarr.addTask(brushWalls);
        homeTaskCalendarr.addTask(doExercices);
        System.out.println(homeTaskCalendarr);
        System.out.println("----------------------------------------------------------------");

        homeTaskCalendarr.removeTask(brushWalls);
        System.out.println(homeTaskCalendarr);
    }
}