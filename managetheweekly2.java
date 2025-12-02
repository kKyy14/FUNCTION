import java.util.Scanner;

public class managetheweekly2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter number of weeks: ");
        int numWeeks = scanner.nextInt();
        scanner.nextLine(); 

        String[] students = new String[numStudents];
        int[][] grades = new int[numStudents][numWeeks];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
            for (int j = 0; j < numWeeks; j++) {
                System.out.print("Enter grade for " + students[i] + " in Week " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }

        System.out.println("\nAll Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(students[i] + ": ");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

    }
}