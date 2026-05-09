
public class StudentExamp {

    public Integer id;
    public String name;

    public StudentExamp(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }
}
