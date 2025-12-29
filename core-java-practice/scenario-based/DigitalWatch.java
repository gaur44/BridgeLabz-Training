public class DigitalWatch {
    public static void main(String[] args) {
        System.out.println("Digital Watch Simulation");

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + ":" + minute);

                if (hour == 13 && minute == 0) {
                    System.out.println("Power Cut!");
                    break;
                }
            }

            if (hour == 13) {
                break;
            }
        }
    }
}