
import java.util.function.Predicate;

 
public class exampre {

    public static void main(String[] args) {

        Predicate<String> Letterv = l -> l.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsletteL = l -> l.toLowerCase().charAt(l.length() - 1) == 'l';
        //AND method jish me do list so add karke chek karna
        //  AND dono condition true honi chaiye 
        Predicate<String> and = endsletteL.and(Letterv);
        Predicate<String> or = endsletteL.or(Letterv);
        //dono conditon true honi chaiye 
        System.out.println(and.test("Vipul")); 
        //dono me se ek bhi true honi chaiye
        System.out.println(or.test("View"));
        // Condition false hone par true hoti he 
        System.out.println(endsletteL.negate().test("Vipul"));

        // isEqual Equality Chek karne ke liye 
        Predicate<Object> predicate = Predicate.isEqual("Vipul");
        System.out.println(predicate.test("Vipul" ));
       
        
        Student s1 = new Student("Raaj", 1);
        Student s2 = new Student("karn", 2);
        Predicate<Student> pre = x -> x.getid() >  1;
       System.out.println(pre.test(s2));
    }
    //Examle class
   private static class Student{
    private String name;
    private int id;
    
    public Student(String name,int id) {
     this.name = name;
     this.id = id;
    }
     public String getName(){
        return name;
     }

     public void setName(String name){
        this.name = name;
     }
        public int getid(){
        return id;
     }

     public void setName(int id){
        this.id = id;
     }


           
        }

}
