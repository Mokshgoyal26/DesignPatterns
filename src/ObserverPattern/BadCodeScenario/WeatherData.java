package ObserverPattern.BadCodeScenario;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionsDisplay currentConditions;
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statsDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditions , ForecastDisplay forecastDisplay , StatisticsDisplay statsDisplay){

        this.currentConditions =currentConditions;
        this.forecastDisplay = forecastDisplay;
        this.statsDisplay = statsDisplay;
    }

    public void setMeasurements(float temperature , float pressure , float humidity){

        this.temperature =  temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    private void measurementsChanged(){
        // manually updating the data every time data changed
        currentConditions.update(temperature , humidity , pressure);
        forecastDisplay.update(temperature , humidity , pressure);
        statsDisplay.update(temperature , humidity , pressure);

    }

}
