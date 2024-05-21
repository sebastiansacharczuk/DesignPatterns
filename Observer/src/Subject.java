import java.util.List;

public abstract class Subject {
    protected  List<Observer> observers;
    public abstract void attach(Observer observer);
    public abstract void notifyAllObservers();
}
