import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        if(numberOfStudents == students.length ){
            String[] temp = new String[numberOfStudents*2];
            System.arraycopy(students, 0, temp, 0, numberOfStudents);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

        int index, length;

        for(int i=0;i<numberOfStudents;i++){
            if(students[i]==student) {
                index = i;
                String[] temp = new String[--numberOfStudents];

                System.arraycopy(students, 0, temp, 0, index);
                length = numberOfStudents - index;
                System.arraycopy(students, index + 1, temp, index, length);

                students = temp;
                break;
            }
            else if(students[i]==null) break;
        }

    }

    public void clear(){
        students = null;
        numberOfStudents=0;
    }
}

