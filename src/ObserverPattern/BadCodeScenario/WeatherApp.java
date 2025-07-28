package ObserverPattern.BadCodeScenario;

public class WeatherApp {
    public static void main(String[] args){
        CurrentConditionsDisplay current = new CurrentConditionsDisplay();
        ForecastDisplay forecast = new ForecastDisplay();
        StatisticsDisplay stats = new StatisticsDisplay();

        WeatherData weather = new WeatherData(current , forecast ,stats);

        System.out.println("--- first Readings ---");
        weather.setMeasurements(30,70,1010);

        System.out.println("--- second Readings ---");
        weather.setMeasurements(32,65,1038);

        System.out.println("--- third Readings ---");
        weather.setMeasurements(28,90,1007);


    }
}
