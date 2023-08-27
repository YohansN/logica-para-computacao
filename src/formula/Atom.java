package formula;

import java.util.Objects;

public class Atom {
    private String name;

    public String getName() {
        return name;
    }

    public Atom(String name){
        super();
        this.name = name;
    }

    public boolean IsEqual(Object other) {
        return this.equals(other);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, "atom");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
