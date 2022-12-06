import java.util.*;
class Student
{
    private String rollNumber;
    private String name,course;
    static private int count =0;
    
    private String GenerateRoll()
    {
        Date d = new Date();
        count++;
        return "Univ"+"-"+(d.getYear()+1900)+"-"+count;
    }
    
    Student(String name,String course)
    {
        this.name = name;
        this.course = course;
        this.rollNumber = GenerateRoll();
    }
    
    public String Getdata()
    {
        return this.name+"\n"+this.course+"\n"+this.rollNumber;
    }
    
    
}

class GenerateRollNoChanllenge{
    public static void main(String args[])
    {
        Student s = new Student("chandu","MS");
        Student s1 = new Student("Madhu","Diploma");
        
        String Student1=s.Getdata();
        String Student2 =s1.Getdata();
        
        System.out.println(Student1);
        System.out.println("**************************");
        System.out.println(Student2);
        
        
    }
}