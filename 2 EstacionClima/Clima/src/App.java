public class App {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer cc = new CurrentConditions(wd);
        Observer sd = new StatisticsDisplay(wd);

    wd.setMeasurements(80f, 65f, 30.4f);
    wd.setMeasurements(82f, 70f, 29.2f);
	wd.setMeasurements(78f, 90f, 29.2f);

    }

    
}
