package m.ermolaev;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringRecipe {
    List<StringTransformer> list;
    public StringRecipe(List<StringTransformer> list){
        this.list = list;
    }

    public void mix (StringDrink drink){
        for (int i = 0; i < list.size(); i++){
            list.get(i).execute(drink);
        }
    }

    public void undo (StringDrink drink){
        Collections.reverse(list);
        mix(drink);
    }
}
