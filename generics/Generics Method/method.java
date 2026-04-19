
public class method {

    public static void main(String[] args) {
        method m = new method();
        Integer[] intArray = {2, 3, 4, 2, 1, 3, 5};
        String[] intString = {"Hello", "World"};
        m.printArray(intArray);

        m.printArray(intString);
    }

    // Mehtod with Parameter type array derect 
    // call ke liye static bhi de sakte he 
    public <T> void printArray(T[] array) {
        for (T elem : array) {
            System.out.println(elem + " ");
        }

    }

    // Mehtod Override
    public void printArray(Integer array) {
        System.out.println("Integer display : " + array);
    }
}
