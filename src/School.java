import java.util.ArrayList;

public class School {

    //FIELDS------------------------------------------------------
    public String name;
    public String location;
    public int population;

    //ARRAY LISTS------------------------------------------------------
    private ArrayList<Teacher> teacherList=new ArrayList<>();
    private ArrayList<Student> studentlist=new ArrayList<>();


    //METHODS------------------------------------------------------
    //CONSTRUCTORS
    School(String name, String location, int population){
        this.name=name;
        this.location=location;
        this.population=population;
    }


    //SETTERS & GETTERS
    public String getName(){
        System.out.println(name);
        return name;
    }
    public String getLocation(){
        System.out.println(location);
        return location;
    }
    public int getPopulation(){
        System.out.println(population);
        return population;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setLocation(String newLocation) {
        this.name = newLocation;
    }
    public void setPopulation(int newPopulation){
        this.population=newPopulation;
    }








}
