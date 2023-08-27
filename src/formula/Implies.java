package formula;

import java.util.Objects;

public class Implies extends Formula{
    private Formula left;
    private Formula right;

    public Implies( Formula left, Formula right){
        super();
        this.left = left;
        this.right = right;
    }

    public boolean isEqual(Object other){ return this.equals(other); }

    @Override
    public int hashCode() { return Objects.hash(this.left, this.right, "implies"); }

    @Override
    public String toString() {
        return "(" + this.left.toString() + " " + "\u2192" + " " + this.left.toString();
    }
}
