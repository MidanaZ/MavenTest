package classmate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args){

        List<String> stulist = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Student stu1 = new Student("Trung",22,2000);
        Student stu2 = new Student("Son",22,2000);
        Student stu3 = new Student("Phuoc",22,2000);
        studentList.add(stu1);
        System.out.println(studentList);

        stulist.add("Trung");
        stulist.add("Son");
        stulist.add("Phuoc");

        for (String item : stulist){
            System.out.println(item);
        }
        List<String> ageList = new ArrayList<>();
        ageList.add("23");
        ageList.add("20");
        ageList.add("18");
        ageList.add("30");
        Collections.sort(ageList);


        stulist.addAll(ageList);
        System.out.println(stulist);
        System.out.println("Co bn ten Trung ko ak ? "+ stulist.contains("Trung"));
        System.out.println(ageList);
        Collections.shuffle(ageList);
        System.out.println(ageList);

        if(Collections.binarySearch(ageList, "20")>0){
            System.out.println("Co 20 tuoi");
        }else {
            System.out.println("ko co");
        }
        String s = "Hello";
        s+= " world";
        System.out.println(s +"!!!");
        String s1 = "trung";
        char [] ch = s1.toCharArray();
        for (int i = 0; i <ch.length; i++){
            System.out.println(ch[i]);
        }
        System.out.println(s.isEmpty());







    }
}
