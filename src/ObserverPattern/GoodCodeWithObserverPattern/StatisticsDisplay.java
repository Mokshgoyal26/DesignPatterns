package ObserverPattern.GoodCodeWithObserverPattern;

public class StatisticsDisplay implements Observer , DisplayElement{

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float sumTemp = 0.0f;
    private int numReadings = 0;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        sumTemp += temperature;
        numReadings++;

        if (temperature > maxTemp) maxTemp = temperature;
        if (temperature < minTemp) minTemp = temperature;

        display();
    }

    public void display() {
        float avgTemp = sumTemp / numReadings;
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }

}
