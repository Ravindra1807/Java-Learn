
public class GenericsEXOne<R> {

    /*  PlaceHolder="<T>" this Generics Types FULL CLASS
    PlaceHolder Rule = Single Letter Any Word = Q, E, W, R, T, D, .. 
    
    T : type
    E : Element(used in collections) 
    K : key (used in map)
    V : Value (used in Maps) 
    N : Number 
    */
    private R value;

    public R getValue() {
        return value;
    }

    public void setValue(R value) {
        this.value = value;
    }
}
