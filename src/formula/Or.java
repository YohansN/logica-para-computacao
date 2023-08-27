package formula;

import java.util.Objects;

public class Or extends Formula{
    private Atom left;
    private Atom right;

    public Or(Atom left, Atom right){
            super();
            this.left = left;
            this.right = right;
        }

        public boolean isEqual(Object other){
            return this.isEqual(other);
        }

        @Override
        public int hashCode(){
            return Objects.hash(this.left, this.right, "and");
        }

        @Override
        public String toString() {
            return "(" + this.left.toString() + " \u2228 " + this.right.toString() + ")";
        }
}
