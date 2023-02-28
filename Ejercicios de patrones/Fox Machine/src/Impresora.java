public abstract class Impresora {
     DiscountBehavior discountBehavior;
    
    public Impresora(){

    }

    public void setDiscountBehavior(DiscountBehavior db){
        discountBehavior = db;
    }

    public abstract void display();

    public void showPrinter(){
        display();
    }

}