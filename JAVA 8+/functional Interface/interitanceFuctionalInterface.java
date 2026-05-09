
interface perents {

    void sayhello();
}

@FunctionalInterface   //sigle Abstract method aata he or default,static method kitne bhi aa jaae fark nhi padta 
interface child extends perents {

    void sayhello();  // agar app perents class ke method use karo to koi 
    // FunctionalInterface he
    // agar aap ne extends karaya huaa he or method ushra koi batnate ho to ye FunctionalInterface nhi mana jaata 
    // void hello();
}

public class interitanceFuctionalInterface {

    public static void main(String[] args) {

    }
}
