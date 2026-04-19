//Bounded Type Parameter

class Number {

}

interface Printable {

    void print();
}

class bouE extends Number implements Printable {

    private final int value;

    public bouE(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println("My Number : " + value);
    }

    public int intValue() {
        return value;
    }

    public long longValue() {
        return value;
    }

    public double doubleValue() {
        return value;
    }

}

 class Box<T extends Number & Printable> {

    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class bouExample {

    public static void main(String[] args) {
        bouE My = new bouE(23);

        Box<bouE> box = new Box<>(My);
        box.display();
    }
}
