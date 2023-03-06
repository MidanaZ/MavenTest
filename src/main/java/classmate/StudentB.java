package classmate;

public class StudentB extends Student{
    StudentB(String name, int age , int year){
        super(name,age,year);
    }
    public void getnewInfo(){
        super.getInfo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
