class Student{
String name;
String cours;
int roll;

Student(String n,String c,int r){
    name = n;
    cours = c;
    roll = r;
}

void Student(){
System.out.print(name + " "  + cours + " " + roll );
}
}
class ParameterizedConstructorDemo{
    public static void main(String a[]){
     Student s1 = new Student("Hoper","MCA",1755);
    

    s1.Student();

    }
}