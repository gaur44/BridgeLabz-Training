public class TemperatureAnalyzer {
    public static void analyzeTemperatures(float[][] temps) {
        float[] dailyAvg = new float[7];

        for (int i = 0; i < 7; i++) {
            float daySum = 0;
            for (int j = 0; j < 24; j++) {
                daySum += temps[i][j];
            }
            float dayAvg = daySum / 24;

            dailyAvg[i] = dayAvg;
        }

        int hottestDay = 0;
        int coldestDay = 0;

        float maxAvg = Float.MIN_VALUE;
        float minAvg = Float.MAX_VALUE;
        System.out.println("Daily Averages:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i+1) + ": " + dailyAvg[i]);
            if (dailyAvg[i] > maxAvg) {
                maxAvg = dailyAvg[i];
                hottestDay = i+1;
            }
            if (dailyAvg[i] < minAvg) {
                minAvg = dailyAvg[i];
                coldestDay = i+1;
            }
        }
        System.out.println("Coldest Day: " + "day " + coldestDay);
        System.out.println("Hottest Day: " + "day " + hottestDay);
    }

    public static void main(String[] args) {
        float[][] temperatures = new float[7][24];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temperatures[i][j] = 20 + (float) (Math.random() * 15);
            }
        }

        analyzeTemperatures(temperatures);
    }
}