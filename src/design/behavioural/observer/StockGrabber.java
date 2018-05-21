package design.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements ISubject
{

    private List<IObserver> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver newObserver)
    {
        observers.add(newObserver);
    }

    @Override
    public void unregister(IObserver deleteObserver)
    {
        int index = observers.indexOf(deleteObserver);
        observers.remove(index);
        System.out.println("Observer " + index+1 + " deleted");
    }

    @Override
    public void notifyObserver()
    {

        for (IObserver observer: observers)
        {
            observer.update(applePrice, googlePrice, ibmPrice);
        }
    }

    public void setIbmPrice(double nwibmPrice) {
        this.ibmPrice = nwibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double nwapplePrice) {
        this.applePrice = nwapplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double nwgooglePrice) {
        this.googlePrice = nwgooglePrice;
        notifyObserver();
    }
}
