public class BallonDuck extends Duck{

    public BallonDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithBallon();
        
    }

    public void display() {
        System.out.println("Soy un patito que vuela con ayuda jsjsjs");
        
    }
}
