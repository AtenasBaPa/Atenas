public class CurrentConditions implements Observer{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    Subject wd;
    
    
    public CurrentConditions(Subject wd){
        this.wd = wd;
        weatherData.registerObserver (this);
}
    
    public void update(float temp, float humidity, float pressure) {
        this.temperature= temp;
        this.humidity = humidity;
        this.pressure=pressure;
        display();
    }

   
    public void display() {
        System.out.println ("Current conditions: "+temperature + 
                         "F degrees," + humidity + "% humidity, and "+
                          pressure+ "pressure" );
    }

}