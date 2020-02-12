import java.util.ArrayList;

public class Teacher {
    //Teachers teach the students

    //FIELDS------------------------------------------------------
    public String firstname;
    public String lastname;
    public String subject;


    //METHODS------------------------------------------------------
    //CONSTRUCTORS
    Teacher(String firstname, String lastname, String subject){
        this.firstname=firstname;
        this.lastname=lastname;
        this.subject=subject;
    }


    //SETTERS & GETTERS
    public String getName(){
        return firstname+" "+lastname;
    }
    public String getSubject(){
        return subject;
    }
    public void setName(String newFirstname){
        this.firstname=newFirstname;
    }
    public void setLastname(String newLastname) {
        this.lastname = newLastname;
    }
    public void setSubject(String newSubject){
        this.subject=newSubject;
    }

    //Makes class a string
    public String toString(){
        return "NAME: "+firstname+" "+lastname+" || SUBJECT: "+subject+"";
    }

}
