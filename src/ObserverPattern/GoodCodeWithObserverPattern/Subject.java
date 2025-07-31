package ObserverPattern.GoodCodeWithObserverPattern;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObserver();
}
