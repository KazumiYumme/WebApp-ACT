import java.util.Scanner;

public class MP1_yourcompletename {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Sample Grade Computation [F2F Only]");
        System.out.println("TRACK-STRAND: SHS - ICT-Programming");
        System.out.println("GRADE LEVEL: 11");
        System.out.println("SECTION: 12PP");
        System.out.println("SUBJECT: JAVA Programming");
        System.out.println("*********************************");
        System.out.println();

        System.out.print("Name of Learner: ");
        String name = input.nextLine();

        // Written Works
        double[] writtenWorks = new double[5];
        double writtenTotal = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Written Work #" + (i + 1) + ": ");
            writtenWorks[i] = input.nextDouble();
            writtenTotal += writtenWorks[i];
        }

        // Performance Tasks
        double[] performanceTasks = new double[5];
        double performanceTotal = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Performance Task #" + (i + 1) + ": ");
            performanceTasks[i] = input.nextDouble();
            performanceTotal += performanceTasks[i];
        }

        // First Quarterly Assessment
        System.out.print("First Quarterly Assessment: ");
        double exam = input.nextDouble();

        // Computations based on the given formula
        double writtenWorksGrade = (writtenTotal / 5) * 0.2;
        double performanceTasksGrade = (performanceTotal / 5) * 0.6;
        double quarterlyAssessmentGrade = exam * 0.2;

        double initialGrade = writtenWorksGrade + performanceTasksGrade + quarterlyAssessmentGrade;

        // Output
        System.out.println();
        System.out.println("COMPONENT WEIGHTED SCORE : 20% | 60% | 20%");
        System.out.printf("1ST QUARTER WRITTEN WORKS: %.2f%n", writtenWorksGrade);
        System.out.printf("1ST QUARTER PERFORMANCE TASKS: %.2f%n", performanceTasksGrade);
        System.out.printf("QUARTERLY ASSESSMENT: %.2f%n", quarterlyAssessmentGrade);
        System.out.println();
        System.out.printf("First Quarter Initial Grade: %.0f%n", initialGrade);

        input.close();
    }
}
