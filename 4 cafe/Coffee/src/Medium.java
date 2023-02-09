public class Medium extends SizeCup {
    Beverage beverage;

    public Medium(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Medium";
    }


    public double cost(){
        return (1.5) * beverage.cost();
    }

    @Override
    public String getSize() {
        // TODO Auto-generated method stub
        return null;
    }
}
