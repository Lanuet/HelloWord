package test;

/**
 * Created by nguye on 6/21/2017.
 */
public class Classroom {
    public Classroom() {
    }
    private Student[] students = new Student[10];
    /*
    add a student into classroom
     */
    public void addStudent (Student student){
        for (int i=0;i<students.length;i++){
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
    /*
    show list student in classroom
     */
    public void showList(){
        for (int i=0;i<students.length;i++){
           if (students[i] != null){
               System.out.println("Sinh vien " + (i+1) + ": ");
               students[i].show();
           }
        }
    }
}
