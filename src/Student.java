import java.util.ArrayList;

public class Student {
    //Students learn from the teachers

    //FIELDS------------------------------------------------------
    public String firstname;
    public String lastname;
    public int grade;
    private int studentnum;


    //METHODS------------------------------------------------------
    //CONSTRUCTORS
    Student(String firstname, String lastname, int grade, int studentnum){
        this.firstname=firstname;
        this.lastname=lastname;
        this.grade=grade;
        this.studentnum=studentnum;
    }


    //SETTERS & GETTERS
    public String getName(){
        return firstname+" "+lastname;
    }
    public int getGrade(){
        return grade;
    }
    public int getStudentnum(){
        System.out.println(studentnum);
        return studentnum;
    }
    public void setName(String newFirstname){
        this.firstname=newFirstname;
    }
    public void setLastname(String newLastname) {
        this.lastname = newLastname;
    }
    public void setGrade(int newGrade){
        this.grade=newGrade;
    }
    public void setStudentnum(int newStudentnum){
        this.studentnum=newStudentnum;
    }

    //Makes class a string
    public String toString(){
        return "NAME: "+firstname+"  "+lastname+" || GRADE: "+grade+"";
    }
}
