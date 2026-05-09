class Student{
    String name;
    static String School; // static function  --> Sabe ke liye ek ho 


    public static void changeScool(){
        School = "New School";
    }
}
class StaticKeywordDemo{
    public static void main(String[] args){ 
    Student.School = "Geverment";  // static keyword ki madad se kahi bhi Exsess kar sakt ehe 

    Student student1 = new Student();
    student1.name = "Tony Stark";
     System.out.println("Name : " + student1.name + "\nSchool : " + student1.School);  
  
    Student student2 = new Student();  
     student2.name = "Ravindra Kumar";  
     System.out.println("Name : " +  student2.name + "\nSchool : "  + student2.School);  
        
      Student.changeScool();  
       
    }  
}  