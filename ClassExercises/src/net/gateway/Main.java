package net.gateway;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    }

    public static void bmi(){
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
        input.close();
    }
    public static void maxOfThree(){
        Scanner scnr = new Scanner(System.in);

        // Collect three doubles as input
        System.out.print("Enter three real numbers: ");
        double num1 = scnr.nextDouble();
        double num2 = scnr.nextDouble();
        double num3 = scnr.nextDouble();


        // Output a label, then determine and output the result
        System.out.print("The largest value collected was: ");

        if ((num1 >= num2) && (num1 >= num3)) {
            // num1 is larger than (or tied with) both num2 and num3,
            // so we can report it as the largest
            System.out.println(num1);

        } else if ((num2 >= num1) && (num2 >= num3)) {
            // num2 is larger than (or tied with) both num1 and num3,
            // so we can report it as the largest
            System.out.println(num2);

        } else {
            // Neither num1 nor num2 are largest, so num3 must be largest
            System.out.println(num3);

        }
    }
    public static void oneAtATime(){
        Scanner scnr = new Scanner(System.in);

        // Collect a sequence of symbols as input, and determine its length
        System.out.print("Enter a word: ");
        String word = scnr.next();
        int length = word.length();

        // Repeat the following for each character but the last one
        int counter = 0;
        while (counter < length - 1) {
            System.out.print(word.charAt(counter));
            System.out.print('*');
            counter = counter + 1;
        }

        //Finally, output the last character in the word
        System.out.println(word.charAt(counter));
    }
    public static void sumOfMany(){
        Scanner scnr = new Scanner(System.in);

        // Set up a variable to hold the running sum of input values
        int sum = 0;

        // Collect the first input value; set largest to hold that value
        // The variable largest will hold the "largest value seen so far".
        System.out.println("Enter list of integers, end with a negative value");
        int num = scnr.nextInt();

        // Repeatedly check if the value currently in num is nonnegative;
        // if it is, add it to the running sum, then collect another
        while (num >= 0) {
            sum = sum + num;
            num = scnr.nextInt();
        }

        // Now that we've received a negative value, output accumulated sum
        System.out.println("Sum of non-negative integers is: " + sum);
    }
}
