public class App {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer cc = new CurrentConditions(wd);
        Observer sd = new StatisticsDisplay(wd);
    }

    wd.setMeasurements(temperature: 80f, humidity: 65f, pressure: 30.4f);
	wd.setMeasurements(temperature: 82f, humidity: 70f, pressure: 29.2f);
	wd.setMeasurements(temperature: 78f, humidity: 90f, pressure: 29.2f);

}
