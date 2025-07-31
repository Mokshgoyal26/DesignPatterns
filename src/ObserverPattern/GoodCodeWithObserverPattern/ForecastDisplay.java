package ObserverPattern.GoodCodeWithObserverPattern;

public class ForecastDisplay implements Observer , DisplayElement{

    private float lastPressure;
    private float current_pressure = 1013;// default pressure

    public ForecastDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    public void update(float temperature , float humidity , float pressure){
        lastPressure = current_pressure;
        current_pressure = pressure;
        display();
    }

    public void display(){
        if(current_pressure > lastPressure){
            System.out.println("Forecast : Improving weather ");
        }else if(current_pressure == lastPressure){
            System.out.println("Forecast : More of Same");
        }else{
            System.out.println("Forecast : Watch Out For Cooler");
        }
    }


}
