package design.behavioural.observer;

public class StockObserver implements IObserver
{

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;


    private static int observerIDTracker = 0;
    private int observerID;
    private ISubject stockGrabber;

    // constructor
    public StockObserver(ISubject stockGrabber)
    {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer " + this.observerID);
        stockGrabber.register(this);
    }


    @Override
    public void update(double applePrice, double googlePrice, double ibmPrice)
    {
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        this.ibmPrice = ibmPrice;
        printThePrices();
    }

    private void printThePrices()
    {
        System.out.println(observerID + "\nApple: " + applePrice +
        "\nGoogle: " + googlePrice + "\nIBM: " + ibmPrice);
    }
}
