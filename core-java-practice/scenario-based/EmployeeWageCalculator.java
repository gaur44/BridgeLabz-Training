public class EmployeeWageCalculator {
    // UC 1 - Generates random attendance
    public static char dayAttendanceRandom() {
        if (Math.random() < 0.5) {
            return 'A';
        } else {
            return 'P';
        }

    }

    public static boolean isFullTime() {
        return (Math.random() < 0.5);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int hoursWorked = 0;
        int daysWorked = 0;
        int totalDays = 0;

        // UC 2 - Initialize variables with given values
        int wagePerHour = 20;
        int fullDayHour = 8;

        // UC 3 - Initialize part time hour
        int partTimeHour = 4;

        // UC 5 & 6 - Calculate till the end of month
        // assume 20 working days in a month
        while (totalDays < 20) {
            totalDays++;
            if (hoursWorked >= 100) {
                break;
            }
            char todayAttendance = dayAttendanceRandom();

            // UC 4 - Switch Case Statements
            switch (todayAttendance) {
                case 'P':
                    if (isFullTime()) {
                        hoursWorked += fullDayHour;
                        System.out.println("Day " + totalDays + " present full-time.");
                    } else {
                        hoursWorked += partTimeHour;
                        System.out.println("Day " + totalDays + " present part-time.");
                    }
                    daysWorked += 1;
                    break;
                case 'A':
                    System.out.println("Day " + totalDays + " absent.");
                    break;
            }
        }
        System.out.println("Number of days worked: " + daysWorked);
        System.out.println("Number of hours worked: " + hoursWorked);
        System.out.println("Wage: " + wagePerHour * hoursWorked);
    }
}
