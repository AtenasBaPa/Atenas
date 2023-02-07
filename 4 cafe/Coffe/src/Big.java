public class Big extends CondimentDecorator {
    Beverage beverage;

    public Big(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Big";
    }

    public double cost(){
        return 2 * beverage.cost();
    }
}