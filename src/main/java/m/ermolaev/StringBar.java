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
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).happyHourStarted(this);
        }
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).happyHourEnded(this);
        }
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
