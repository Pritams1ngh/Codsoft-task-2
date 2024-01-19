import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int no = sc.nextInt();
        
        char grade;
        int totalMarks = 0;

        for (int i = 1; i <= no; i++) {
            System.out.println("Enter marks obtained in Subject " + i + ":");
            totalMarks += sc.nextInt();
        }

        double averagePercentage = (double) totalMarks / no;

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 35) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}