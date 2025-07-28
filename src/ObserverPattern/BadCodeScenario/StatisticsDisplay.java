package ObserverPattern.BadCodeScenario;

public class StatisticsDisplay {
    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float sumTemp = 0;
    private int numReadings = 0;

    public void update(float temperature , float humidity , float pressure){
        sumTemp += temperature;
        numReadings++;
        maxTemp = Math.max(maxTemp , temperature);
        minTemp = Math.min(minTemp , temperature);
        display();
    }


    public void display() {
        System.out.println("Avg/Max/Min temperature = "+
                (sumTemp / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
