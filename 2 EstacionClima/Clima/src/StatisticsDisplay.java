public class StatisticsDisplay implements Observer {
	private float temperature;
	private float humidity;
	private float pressure;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReading;
	Subject wd;

	public StatisticsDisplay(Subject wd) {
		this.wd = wd;
		wd.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
		display();
	}


	public void display() {

		tempSum += temperature;
		numReading++;
		if (temperature > maxTemp){
			maxTemp = temperature;
		}

		if (temperature > minTemp){
			minTemp = temperature;
		}

		System.out.println("Statistics conditions: " + tempSum/numReading +
                        "F degrees average " +
						" and" + maxTemp + " max" +
						" and" + minTemp + " min");
	}
	
}