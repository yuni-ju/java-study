public class Practice7_1 {

    public static void main(String[] args) {
        String[] course1, course2;

        //course1 생성 및 출력
        Course c1 = new Course("course1");
        c1.addStudent("Peter Jones");
        c1.addStudent("Brian Smith");
        c1.addStudent("Anne Kennedy");
        System.out.println("Number of student in " + c1.getCourseName()+": "+ c1.getNumberOfStudents());
        course1 = c1.getStudents();

        for(int i=0;i<c1.getNumberOfStudents();i++){
            if(course1[i]==null) break;
            System.out.print(course1[i]+", ");
        }
        System.out.println();

        //course2 생성 및 출력
        Course c2 = new Course("course2");
        c2.addStudent("S1");
        c2.addStudent("S2");
        c2.addStudent("S3");
        c2.addStudent("S4");
        System.out.println("Number of student in " + c2.getCourseName()+": "+ c2.getNumberOfStudents());
        course2 = c2.getStudents();

        for(int i=0;i<c2.getNumberOfStudents();i++){
            if(course2[i]==null) break;
            System.out.print(course2[i]+", ");
        }
        System.out.println();

        //c1에서 Peter Jones 드롭 및 출력
        c1.dropStudent("Peter Jones");
        System.out.println("Number of students in "+c1.getCourseName()+" after drop Peter Jones: "+ c1.getNumberOfStudents());
        course1 = c1.getStudents();

        for(int i=0;i<c1.getNumberOfStudents();i++){
            if(course1[i]==null) break;
            System.out.print(course1[i]+", ");
        }
        System.out.println();

        //c1 clear
        c1.clear();
        System.out.println("Number of students in "+c1.getCourseName()+" after clear: "+ c1.getNumberOfStudents());

        //c2에서 S2드롭 및 출력
        c2.dropStudent("S2");
        System.out.println("Number of students in "+c2.getCourseName()+" after drop S2: "+ c2.getNumberOfStudents());
        course2 = c2.getStudents();

        for(int i=0;i<c2.getNumberOfStudents();i++){
            if(course2[i]==null) break;
            System.out.print(course2[i]+", ");
        }
        System.out.println();

        //c2 clear
        c2.clear();
        System.out.println("Number of students in "+c2.getCourseName()+" after clear: "+ c2.getNumberOfStudents());

    }

}
