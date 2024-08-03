package todoapp;

import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Remove Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.listTasks();
                    System.out.print("Enter task number to edit: ");
                    int editIndex = scanner.nextInt() - 1;
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    toDoList.editTask(editIndex, newDescription);
                    break;
                case 3:
                    toDoList.listTasks();
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.listTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
