package Exercise7_ImplementingtheObserverPattern.Code;

public interface Stock {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

