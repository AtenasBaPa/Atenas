import static java.lang.System.out;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
     this.duck = duck;
    }

    public void gobble() {
     duck.quack();
    }

    public void fly() {
     duck.fly();
     out.println("A short distance");
    }
}
