//Daniel Shaw
//Exercise 02
//1.23.25

public class Main {
    public static void main(String[] args) {

        // List of temperatures for each day
        int[] temperatures = {45, 29, 10, 22, 41, 28, 33};


        int[] precipitationProbabilities = {95, 60, 25, 5, 0, 75, 90};


        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        for (int i = 0; i < temperatures.length; i++) {

            // Check if the temperature is less than or equal to 32 and probability of precipitation is greater than 50%
            if (temperatures[i] <= 32 & precipitationProbabilities[i] > 50) {
                System.out.println("It is likely to snow on " + daysOfWeek[i] + ".");
            }
        }
    }
}
