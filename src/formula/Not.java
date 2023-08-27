package formula;

import java.util.Objects;

public class Not extends Formula{
    private Atom inner;
    public Not(Atom inner){
        super();
        this.inner = inner;
    }

    public boolean isEqual(Object other){ return this.equals(other); }

    @Override
    public int hashCode(){
        return Objects.hash(this.inner, "inner");
    }

    @Override
    public String toString() {
        return "(" + "\u00ac" + this.inner.toString() + ")";
    }
}
