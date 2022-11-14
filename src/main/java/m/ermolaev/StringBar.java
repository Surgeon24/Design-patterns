package m.ermolaev;

import java.util.List;

public class StringBar extends Bar{
    Boolean happyHour = false;

    public StringBar(){}
    public StringBar(List<BarObserver> list) {
        super(list);
    }

    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
    }
}
