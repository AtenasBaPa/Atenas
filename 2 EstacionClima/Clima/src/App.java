public class App {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer cc = new CurrentConditions(wd);
    }

    weatherData.setMeasurements(80f, 65f, 30.4f);
	weatherData.setMeasurements(82f, 70f, 29.2f);
	weatherData.setMeasurements(78f, 90f, 29.2f);
}
