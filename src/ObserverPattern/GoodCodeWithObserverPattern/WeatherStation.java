package ObserverPattern.GoodCodeWithObserverPattern;

public class WeatherStation {
    // WeatherStation.java

        public static void main(String[] args) {
            WeatherData weatherData = new WeatherData();

            CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
            ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

            // Simulate new weather measurements
            weatherData.setMeasurements(26.5f, 65, 1010);
            System.out.println("----");
            weatherData.setMeasurements(27.3f, 70, 1005);
            System.out.println("----");
            weatherData.setMeasurements(25.2f, 90, 1008);
        }


}
