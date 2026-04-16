class School{
    String name = "Ravindra Kumar";
     int roll = 1001;

     
      
    void outerClass()
    {
     System.out.println("Name : " + name + "Roll No. : " + roll);
     
    }
    class Student{

       Student(){
        name = "Rony";
        roll = 1855;
       }
        void Show(){
            System.out.println("Name : " + name + " Roll No. : " + roll);
        }
    }
  
    

}
public class i2{
    public static void main(String[] args) {
       School s = new School();
             s.outerClass();

       School.Student std = s.new Student();

       std.Show();



    }
}