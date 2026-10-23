import java.util.Scanner;

public class HealthTracker {
    public static void main(String[] args) {
        Scanner W = new Scanner(System.in);
        System.out.print("Enter Your Weight(Please send in kilograms): ");
        double weight = W.nextDouble();
        System.out.print("Enter Your Height(Please send in meters): ");
        double height = W.nextDouble();
        System.out.print("Enter Your Age in years: ");
        double age = W.nextDouble();
        double BMI = weight / (height * height);

             if (BMI < 18.5) {
            System.out.print("You are Underweight!!");
        } else if (BMI < 25.0) {
            System.out.println("You are Normal Weight!!");
        } else if (BMI < 30.0) {
            System.out.println("You are Overweight!!");
        } else {
            System.out.println("You are Obese!!");
            }
        System.out.println("================================================");
        System.out.println("Do you want any calorie Plan: 1. Yes  2. No");
        int choice = W.nextInt();

        switch (choice) {
            case 1:
                double heightCm = height * 100.0;
                double BMRm = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
                double BMRf = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);

                double tdeeMale = BMRm * 1.375;
                double tdeeFemale = BMRf * 1.375;

                System.out.println("\n================================================");
                System.out.println("   YOUR PERSONALIZED HEALTH & NUTRITION PLAN   ");
                System.out.println("================================================");
                System.out.printf("Base Metabolic Rate (BMR) Male   : %.2f kcal\n", BMRm);
                System.out.printf("Base Metabolic Rate (BMR) Female : %.2f kcal\n", BMRf);
                System.out.println("------------------------------------------------");
                System.out.printf("Daily Maintenance Calories (Male)  : %.0f kcal\n", tdeeMale);
                System.out.printf("Daily Maintenance Calories (Female): %.0f kcal\n", tdeeFemale);
                System.out.println("------------------------------------------------");

                if (BMI < 18.5) {
                    System.out.println("Suggested Meal Plan: High calorie surplus diet (Rice, Eggs, Nuts).");
                } else if (BMI < 25.0) {
                    System.out.println("Suggested Meal Plan: Balanced diet (Veggies, Fruits, Lean protein).");
                } else {
                    System.out.println("Suggested Meal Plan: Low calorie deficit diet (High fiber, Less sugar).");
                }
                System.out.println("================================================");

                break;

            case 2:
                System.out.println("Thank you! Program ended without a calorie plan.");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
