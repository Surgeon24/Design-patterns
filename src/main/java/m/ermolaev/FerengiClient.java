package m.ermolaev;

public class FerengiClient extends AlienClient{
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }


}
