import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp
{
    private static List<Task> taskList = new ArrayList<>();

    private static int listCounter = 1;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("To-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice)
            {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTaskAsCompleted(sc);
                    break;
                case 4:
                    removeTask(sc);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner sc)
    {
        System.out.println("Enter the task Description : ");
        String description = sc.nextLine();
        Task task = new Task(listCounter, description);
        taskList.add(task);
        System.out.println("Task is Added Successfully !");
        System.out.println("No. of tasks added into list : " + listCounter);
        listCounter++;
    }

    private static void listTasks()
    {
        if(taskList.isEmpty())
        {
            System.out.println("No tasks to display !");
        }
        else
        {
            System.out.println("Tasks :");
            for(Task task : taskList)
            {
                System.out.println(task);
            }
        }
    }

    private static void markTaskAsCompleted(Scanner sc)
    {
        System.out.println("Enter the id to mark as complete : ");
        int completedId = sc.nextInt();
        for(Task task : taskList)
        {
            if(task.getId()==completedId)
            {
                task.setCompleted(true);
                System.out.println("Task Completed..");
                return;
            }
        }
        System.out.println("Task not found !");
    }

    private static void removeTask(Scanner sc)
    {
        System.out.println("Enter the id to remove : ");
        int id = sc.nextInt();
        for(Task task : taskList)
        {
            if(task.getId() == id)
            {
                taskList.remove(task);
                System.out.println("Task removed for id : " + id);
                return;
            }
        }
        System.out.println("Please enter valid task id..Not found");
    }
}

