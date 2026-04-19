 
  class Cons<T extends Number >{
   private T value;
   
   public Cons(T value){
    this.value = value;
   }
   public T getvalue(){
    return value;
   }
   public T setValue(){
    return value;
   }
    public void setValue(T value){
        this.value= value;
    }

}


// Class without class generics bane 
// Constructor ko generics type banaya
  class test {
    //Class without generics build a Generics Constructor 
    /*  public <T extends Number> test(T value){

      }*/ 
     public <T> test(T value){
    
     } 
     public static void main(String[] args) {
        test s = new test("Hello");
        test i = new test(4);

     }
}
