public class managetheweekly {
    static String[] students = {"Sari", "Rina", "Yaoi", "Dwi", "Lusi"};
    static int[][] grades = {
        {20, 19, 25, 20, 10, 0, 10},
        {30, 0, 40, 10, 15, 20, 25},
        {5, 0, 20, 25, 0, 5, 45},
        {50, 0, 0, 30, 0, 30, 60},
        {15, 10, 16, 15, 10, 10, 5}
    };

    public static void displayGrades() {
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void weekWithHighestGrade() {
        int maxGrade = -1;
        int weekIndex = -1;
        for (int week = 0; week < 7; week++) {
            for (int student = 0; student < 5; student++) {
                if (grades[student][week] > maxGrade) {
                    maxGrade = grades[student][week];
                    weekIndex = week;
                }
            }
        }
        System.out.println("Week with highest grade: Week " + (weekIndex + 1) + " with grade " + maxGrade);
    }

    public static void studentWithHighestTotal() {
        int maxTotal = -1;
        int topStudentIndex = -1;
        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                topStudentIndex = i;
            }
        }
        System.out.println("Top student: " + students[topStudentIndex] + " with total grade " + maxTotal);
        System.out.print("Weekly grades: ");
        for (int grade : grades[topStudentIndex]) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        displayGrades();
        weekWithHighestGrade();
        studentWithHighestTotal();
    }
}