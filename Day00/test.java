import java.util.Scanner;

public class StudentProgressWithoutContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gradesStore = ""; // This will store the minimum grades for all weeks as characters
        int currentWeek = 0; // Track the current week

        while (true) {
            // Read week input
            System.out.print("Enter Week: ");
            String weekInput = scanner.nextLine();

            // Check for termination condition
            if (weekInput.equals("42")) {
                break;
            }

            // Validate week format (e.g., "Week 1")
            if (!weekInput.startsWith("Week ") || weekInput.length() < 6) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            // Extract week number
            int weekNumber;
            try {
                weekNumber = Integer.parseInt(weekInput.substring(5));
            } catch (NumberFormatException e) {
                System.err.println("IllegalArgument");
                System.exit(-1);
                return; // Not strictly necessary but added for clarity
            }

            // Check for sequential week order
            if (weekNumber != currentWeek + 1) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            currentWeek = weekNumber; // Update the current week

            // Read grades input
            System.out.print("Enter Grades: ");
            String gradesInput = scanner.nextLine();

            // Split grades and find the minimum grade
            String[] grades = gradesInput.split(" ");
            if (grades.length != 5) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            int minGrade = 9; // Maximum possible grade
            for (String grade : grades) {
                int gradeValue;
                try {
                    gradeValue = Integer.parseInt(grade);
                } catch (NumberFormatException e) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                    return; // Not strictly necessary but added for clarity
                }

                // Validate grade range
                if (gradeValue < 1 || gradeValue > 9) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }

                // Update minimum grade
                if (gradeValue < minGrade) {
                    minGrade = gradeValue;
                }
            }

            // Append the minimum grade to the gradesStore string
            gradesStore += minGrade;
        }

        // Output the progress chart
        for (int i = 0; i < gradesStore.length(); i++) {
            System.out.print("Week " + (i + 1) + " ");
            int minGrade = gradesStore.charAt(i) - '0'; // Convert char back to int
            for (int j = 0; j < minGrade; j++) {
                System.out.print("=");
            }
            System.out.println(">");
        }

        scanner.close();
    }
}