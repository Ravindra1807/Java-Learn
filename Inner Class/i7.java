 
class School {
    private int School_Code;
    
    School(int School_Code)
    {
        this.School_Code = School_Code;
    }

    class Student{    // MEMEBER class
        String name;
    
       void Info(){
        System.out.println("Name : " + name);
        System.out.println("School Code : " + School_Code);
     }
     void R(){
        class Super{  // LOCAL CLASS
                        String Course;

           Super(){
            System.out.println("Super class (LOCAL) Calling ");
            Course = "Bca Sem. III";
           }
           void Dis(){
            System.out.println("Course : " + Course);
           }
               
        } // Object Create 
                Super s = new Super();
                s.Dis();
     }
    }
}
 

public class i7 {
    public static void main(String ar[]){
        School s1 = new School(307030);
         School.Student s2 = s1.new Student();
         s2.name = "Ravindra Kumar";
        // s2.Info();
        s2.R();

        System.out.println("hELLO wOLRD");
        }       
    }
    

