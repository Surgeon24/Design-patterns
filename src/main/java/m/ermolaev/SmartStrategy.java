package m.ermolaev;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    /////not sure



    List<StringRecipe> recipes = new ArrayList<StringRecipe>();
    List<StringDrink> drinks = new ArrayList<StringDrink>();

    StringDrink dr;
    StringRecipe r;


    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.happyHour){
            bar.order(drink,recipe);
        }
        else {
            recipes.add(recipe);
            drinks.add(drink);
            dr = drink;
            r = recipe;
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        /*for (int i = 0; i < drinks.size(); i++){
            bar.order(drinks.get(i), recipes.get(i));
        }
        drinks.removeAll(drinks);
        recipes.removeAll(recipes);

        */
        //bar.order(drinks.get(0),recipes.get(0));
        bar.order(dr,r);
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
