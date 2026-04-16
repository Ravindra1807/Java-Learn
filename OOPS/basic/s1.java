

class Student{
String name;
String Sub;
int mark;

public void details(){
System.out.print("Name : ");
System.out.println(name);
System.out.print("Subject : ");
System.out.println(Sub);
System.out.print("Mark : ");
System.out.println(mark);
}
}
public class s1{
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Ravindra Kuamr ";
    s1.Sub = "Java ";
    s1.mark = 77;
    s1.details();    
    }
}