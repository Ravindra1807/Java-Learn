abstract  class Animal{    // abstract he ise call nhi kar sate he 
   abstract  void walk();

    
}

class Hourse extends Animal {
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class AnimalAbstractDemo{  //adtration
public static void main(String[] args) {
    Hourse hourse = new Hourse();
    hourse.walk();
   
}
}