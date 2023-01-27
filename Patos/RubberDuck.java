public class RubberDuck extends Duck {
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay(); 
    }

    public void display() {
        System.out.println("Soy un patito de hule");
        
    }
}
