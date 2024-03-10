import java.util.Scanner;

class HealthMonitoringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input variables
        double height, weight;
        
        // Input
        System.out.println("Enter your height in meters: ");
        height = scanner.nextDouble();
        
        System.out.println("Enter your weight in kilograms: ");
        weight = scanner.nextDouble();
        
        // Calculate BMI
        double bmi = calculateBMI(height, weight);
        
        // Display BMI
        System.out.println("Your BMI is: " + bmi);
        
        // Display BMI Category
        System.out.println("BMI Category: " + getBMICategory(bmi));
        
        // Close scanner
        scanner.close();
    }
    
    // Method to calculate BMI
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
    
    // Method to get BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
