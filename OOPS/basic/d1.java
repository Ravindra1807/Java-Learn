
 
class Student{ //   polymorphism    
    String Name;
    int Age;

    public void printInfo(){     // Ek Hi name ke Function bas peramiter Alag HE
        System.out.println(Name); // Jise  Function Orloading
    }

    public void printInfo(int Age){
      System.out.println(Age);
    }

    public void printInfo(String Name,int Age){
        System.out.println(Name + " " + Age);
    }

}

public class d1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Ravindra";
        s1.Age = 17;

        s1.printInfo(s1.Name,s1.Age);
        


    }

}