package net.gateway;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // One pound is 0.45359237 kilograms.
        final double scalarP2K = 0.45359237;
        // One inch is 0.0254 meters.
        final double scalarI2M = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKGs = weightInPounds * scalarP2K;

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * scalarI2M;

        // Compute BMI
        double bmi = weightInKGs / (heightInMeters * heightInMeters);
        System.out.printf("Your BMI is %.2f\n", bmi);

    }
}
