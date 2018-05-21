package design.behavioural.observer;

public class Client
{
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setApplePrice(186.31);
        stockGrabber.setGooglePrice(1069.64);
        stockGrabber.setIbmPrice(144.08);
    }
}
