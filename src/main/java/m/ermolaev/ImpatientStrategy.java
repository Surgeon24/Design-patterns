package m.ermolaev;

public class ImpatientStrategy implements OrderingStrategy{

    ///////not sure



    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink,recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {

    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
