package Firstclass;

// bmi= weight/(height)^2

import java.util.Scanner;

public class BMIMethods {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your gender M(ale) or F(emale)");
        String gender = userInput.next();

        System.out.println("Enter your weight");
        double weight = userInput.nextDouble();

        System.out.println("Enter your height");
        double height = userInput.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is " + bmi);
        makeAdvice(bmi, gender);

    }

    public static double calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;

    }

    public static void makeAdvice(double bmi, String gender) {
        switch (gender) {
            case "M":
                if (bmi < 17.5) {
                    System.out.println("Danger, Anorexia!");

                } else if (17.501 <= bmi && bmi < 20.70) {
                    System.out.println("Underweight!");

                } else if (20.71 <= bmi && bmi < 26.40) {
                    System.out.println("in Ideal range");

                } else if (26.41 <= bmi && bmi < 27.80) {
                    System.out.println("Marginaly overweight");

                } else if (27.81 <= bmi && bmi < 31.10) {
                    System.out.println("Overweight");

                } else
                    System.out.println("Very overweight!");

                break;

            case "F":
                if (bmi < 17.5) {
                    System.out.println("Anarexia");

                } else if (17.51 <= bmi && bmi < 19.10) {
                    System.out.println("Underweight!");

                } else if (19.11 <= bmi && bmi < 25.80) {
                    System.out.println("in Ideal range");

                } else if (25.81 <= bmi && bmi < 32.30) {
                    System.out.println("Overweight");

                } else
                    System.out.println("Very overweight!");

                break;

            default:
                System.out.println("Not valid gender!");

        }
    }
}
