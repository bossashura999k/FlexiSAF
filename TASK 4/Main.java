enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Week {
    void displayDays() {
        System.out.println("All Days of the Week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

class WorkWeek extends Week {
    @Override
    void displayDays() {
        super.displayDays();

        System.out.println("\nWork Days (Mon-Fri):");
        for (Day day : Day.values()) {
            if (day != Day.SATURDAY && day != Day.SUNDAY) {
                System.out.println(day);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        WorkWeek ww = new WorkWeek();
        ww.displayDays();
    }
}