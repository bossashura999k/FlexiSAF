
interface DayCalculator {
    int getHoursInDay();
    int getMinutesInDay();
}

class Day implements DayCalculator {

    @Override
    public int getHoursInDay() {
        return 24;
    }

    @Override
    public int getMinutesInDay() {
        return getHoursInDay() * 60;
    }
}

public class HoursInADay {

    public static void main(String[] args) {

        DayCalculator day = new Day();

        System.out.println("=== Day Calculator ===");
        System.out.println("Hours in a day  : " + day.getHoursInDay());
        System.out.println("Minutes in a day: " + day.getMinutesInDay());
    }
}