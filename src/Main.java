import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudenManager studenManager= new StudenManager();
        boolean exit = false;
        while(!exit){
            System.out.println();
            System.out.println("1-Add student: ");
            System.out.println("2-Show All students: ");
            System.out.println("3-Search student by id: ");
            System.out.println("4-Remove student by id: ");
            System.out.println("5-exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter score: ");
                    double score = scanner.nextDouble();
                    System.out.println("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter location: ");
                    String address = scanner.nextLine();
                   Student student = new Student(id,name,age,score,grade,address);
                   studenManager.addStudent(student);
                    System.out.println("Added successfully!");
                    break;
                case 2:
               studenManager.showAllStudents();
               break;

                case 3:
                    System.out.println("Enter id: ");
                    int ids = scanner.nextInt();
                    studenManager.searchStudentById(ids);
                    break;

                case 4:
                    System.out.println("Enter id: ");
                    int removeId = scanner.nextInt();
                    studenManager.removeStudentById(removeId);
                    break;

                case 5:
                    exit=true;
                    break;
            }
        }


        }
    }
