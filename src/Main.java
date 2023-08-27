import formula.*;

public class Main {
    //You can test your funcions in this module as in the following code:
    public static void main(String[] args) {
        Formula formula1 = new Atom("p");  // p
        Formula formula2 = new Atom("q");  // q
        Formula formula3 = new And(formula1, formula2); // (p /\ q)
        Formula formula4 = new And(new Atom("p"), new Atom("s"));  // (p /\ s)
        Formula formula5 = new Not(new And(new Atom("p"), new Atom("s")));  // (¬(p /\ s))
        Formula formula6 = new Or(new Not(new And(new Atom("p"), new Atom("s"))), new Atom("q"));  // ((¬(p /\ s)) v q)
        Formula formula7 = new Implies(new Not(new And(new Atom("p"), new Atom("s"))), new And(new Atom("q"), new Atom("r")));  // ((¬(p /\ s)) -> (q /\ r))
        Formula formula8 = new Implies(new Not(new And(new Atom("p"), new Atom("s"))), new And(new Atom("q"), new Not(new And(new Atom("p"), new Atom("s"))))); // ((¬(p /\ s)) -> (q /\ (¬(p /\ s))))

        System.out.println(formula1 == formula3);
        System.out.println(formula1 == formula2);
        System.out.println(formula3 == new And(new Atom("p"), new Atom("q")));

        System.out.println("Formula 1: "+ formula1);
        System.out.println("Formula 2: "+ formula2);
        System.out.println("Formula 3: "+ formula3);
        System.out.println("Formula 4: "+ formula4);
        System.out.println("Formula 5: "+ formula5);
        System.out.println("Formula 6: "+ formula6);
        System.out.println("Formula 7: "+ formula7);
        System.out.println("Formula 8: "+ formula8);


    }
}