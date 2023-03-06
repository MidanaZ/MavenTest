package classmate;

public class Student {
    private String name;
    private int age;
    private int year;
    public static String nickname;

    Student(){
    }
    Student(String name,int age, int year){
        this.name = name;
        this.age = age;
        this.year = year;

    }
     public int getAge(){
        return this.age;
     }
     public void setAge(int age){
        this.age = age;

     }
     public int getYear(){
        return this.year;
     }
     public void setYear(int year){
        this.year = year;
     }

     public String getName(){
        return this.name;
     }
     public void setName(String name){
        this.name = name;
     }
    Student(String name){
        this.name = name;
    }
    public void getInfo(){
        System.out.println(""+name);
        System.out.println(""+age);
        System.out.println(""+year);
    }

    @Override
    public String toString() {
        return getName()+" "+getAge()+" "+getYear();
    }
}
