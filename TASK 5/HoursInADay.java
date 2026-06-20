// ============================================================
// Assignment: Calculate hours in a day using an interface
// ============================================================

// STEP 1: The interface — defines the contract.
// It lists WHAT methods must exist, but not HOW they work.
interface DayCalculator {
    int getHoursInDay();     // must return the number of hours in a day
    int getMinutesInDay();   // must return the number of minutes in a day
}

// STEP 2: The class — implements the interface.
// "implements" means this class promises to provide
// real code for both methods listed above.
class Day implements DayCalculator {

    @Override
    public int getHoursInDay() {
        return 24;            // a day always has 24 hours
    }

    @Override
    public int getMinutesInDay() {
        // Reuse getHoursInDay() instead of repeating "24"
        return getHoursInDay() * 60;   // 24 * 60 = 1440 minutes
    }
}

// STEP 3: The Main class — the entry point that runs everything.
public class HoursInADay {

    public static void main(String[] args) {

        // Create a Day object, but store it using the interface type.
        DayCalculator day = new Day();

        System.out.println("=== Day Calculator ===");
        System.out.println("Hours in a day  : " + day.getHoursInDay());
        System.out.println("Minutes in a day: " + day.getMinutesInDay());
    }
}