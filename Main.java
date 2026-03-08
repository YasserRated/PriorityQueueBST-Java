import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PriorityQueueBST pq = new PriorityQueueBST();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Priority Queue using BST =====");

        boolean running = true;

        while (running) {

            System.out.println("\nChoose an operation:");
            System.out.println("1 - Add Hardcoded Students");
            System.out.println("2 - Add Students Manually");
            System.out.println("3 - Pop top student (highest grade)");
            System.out.println("4 - Display all students");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addTestStudents(pq);
                    System.out.println("Hardcoded students added.");
                    break;

                case 2:
                    addStudentsFromUser(pq, sc);
                    break;

                case 3:
                    Student top = pq.pop();
                    if (top != null) {
                        System.out.println("Popped: " + top);
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 4:
                    System.out.println("\nAll Students in Priority Queue:");
                    pq.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }

        System.out.println("\nTotal Comparisons: " + pq.getComparisons());
        System.out.println("Total Swaps: " + pq.getSwaps());
    }

    // Hardcoded data
    public static void addTestStudents(PriorityQueueBST pq) {

        pq.push(new Student("Ali", 101, 85));
        pq.push(new Student("Sara", 102, 90));
        pq.push(new Student("Omar", 103, 70));
        pq.push(new Student("Lina", 104, 88));
        pq.push(new Student("Noor", 105, 95));
        pq.push(new Student("Hani", 106, 60));
        pq.push(new Student("Khaled", 107, 77));
        pq.push(new Student("Rana", 108, 82));
        pq.push(new Student("Tariq", 109, 68));
        pq.push(new Student("Aya", 110, 73));
        pq.push(new Student("Yousef", 111, 96));
        pq.push(new Student("Huda", 112, 66));
        pq.push(new Student("Mona", 113, 91));
        pq.push(new Student("Salem", 114, 74));
        pq.push(new Student("Nada", 115, 80));
        pq.push(new Student("Ziad", 116, 78));
        pq.push(new Student("Laila", 117, 93));
        pq.push(new Student("Fadi", 118, 64));
        pq.push(new Student("Rami", 119, 87));
        pq.push(new Student("Dana", 120, 69));
    }

    // User input
    public static void addStudentsFromUser(PriorityQueueBST pq, Scanner sc) {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine(); // consume newline
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Grade: ");
            int grade = sc.nextInt();

            pq.push(new Student(name, id, grade));
        }
    }
}