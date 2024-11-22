import java.util.*;

public class StudenManager {
   ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void showAllStudents(){
        if(students.isEmpty()){
            System.out.println("Not found student!");
        }else{
            System.out.println("Student list: ");
            for (Student student: students) {
                System.out.println("\n**************************");
                student.showStudentInfo();
                System.out.println("\n**************************");
            }
        }
    }

    public void searchStudentById(int id ){
        boolean found = false ;
        for (Student student : students ){
            if(student.getId()==id){
                System.out.println(" Found student!");
                student.showStudentInfo();
                found= true;
                break;
            }
        }
        if (!found){
            System.out.println("this"+id+"not found");
        }
    }
    public void removeStudentById(int id){
        boolean found = false;
        for(Student student : students ){
            if (student.getId()==id){
                students.remove(student);
                System.out.println("Student with this id :"+id+"was removed!");
                found=true;
                break;
            }
            if(!found){
                System.out.println("Student with this id :"+id+"was not found!");
            }
        }
    }

}
