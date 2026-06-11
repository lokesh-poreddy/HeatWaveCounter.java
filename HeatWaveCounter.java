public class HeatWaveCounter {

    public static int countDaysWithNoHeatWave(int[] temperatures) {
        int noHeatWaveCount = 0;

        for (int temp : temperatures) {
            if (temp <= 30) {
                noHeatWaveCount++;
            }
        }

        return noHeatWaveCount;
    }

    public static void main(String[] args) {
        // Example array of daily temperatures
        int[] weeklyTemperatures = {25, 32, 28, 40, 19, 30, 35};
        
   
        int result = countDaysWithNoHeatWave(weeklyTemperatures);
        
        System.out.println("Temperature Analysis");
        System.out.println("Total days recorded: " + weeklyTemperatures.length);
        System.out.println("Days with NO heat wave (expected 4): " + result);
    }
}