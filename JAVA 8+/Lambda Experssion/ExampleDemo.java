 
public class ExampleDemo  {
    public static void main(String[] args) {
       EmployeeE employee = () -> "Software Engineer";
      System.out.println(employee.getName());
      EmployeeE editor = () -> "editor";
      System.out.println(editor.getName());
    }
}