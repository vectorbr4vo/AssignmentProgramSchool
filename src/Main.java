import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //Makes new school
        School Windermere=new School("Windermere","Canada",1000);


        //Add teacher to list
        ArrayList<Teacher> teacherList=new ArrayList<>();
        Teacher mrRoss=new Teacher("Bob","Ross","Art");
        Teacher mrEinstein=new Teacher("Albert","Einstein","Math");
        Teacher mrNewton=new Teacher("Isaac","Newton","Physics");
        teacherList.add(mrRoss);
        teacherList.add(mrEinstein);
        teacherList.add(mrNewton);


        //Add student to list
        ArrayList<Student> studentList=new ArrayList<>();
        Student Ben=new Student("Ben","Ten",11,1234);
        Student James=new Student("James","Adames",10,5678);
        Student Terry=new Student("Terry","Berry",10,9100);
        Student Ella=new Student("Ella","Bella",9,1112);
        Student Eric=new Student("Eric","Derek",10,1314);
        Student Arko=new Student("Arko","De Marco",12,1516);
        Student Anne=new Student("Anne","A' Dan",8,1718);
        Student Ryan=new Student("Ryan","O'Brien",10,1920);
        Student Dean=new Student("Dean","McQueen",11,2122);
        Student Riley=new Student("Pat","De Matt",9,2324);
        studentList.add(Ben);
        studentList.add(James);
        studentList.add(Terry);
        studentList.add(Ella);
        studentList.add(Eric);
        studentList.add(Arko);
        studentList.add(Anne);
        studentList.add(Ryan);
        studentList.add(Dean);
        studentList.add(Riley);

        //Show all teachers
        System.out.println("-----TEACHERS LIST-----");
        for(int i=0;i<teacherList.size();i++){
            System.out.println(teacherList.get(i));
        }

        System.out.println();

        //Show all students
        System.out.println("-----STUDENTS LIST-----");
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }


        //Remove teacher from list
        teacherList.remove(mrNewton);

        //Remove student from list
        studentList.remove(Ben);
        studentList.remove(Dean);

        System.out.println();
        System.out.println("=========================================");
        System.out.println();


        //Show all teachers updated list
        System.out.println("-----TEACHERS LIST (UPDATED)-----");
        for(int i=0;i<teacherList.size();i++){
            System.out.println(teacherList.get(i));
        }

        System.out.println();

        //Show all students updated list
        System.out.println("-----STUDENTS LIST (UPDATED)-----");
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }

        //Print teacher name


        //Print student name


    }
}
