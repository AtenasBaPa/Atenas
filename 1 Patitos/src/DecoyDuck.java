public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        
    }

    public void display() {
        System.out.println("Soy un patito de madera");
        
    }
}
