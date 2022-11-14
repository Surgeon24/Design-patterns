package m.ermolaev;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> list;
    public StringTransformerGroup(List<StringTransformer> list) {this.list = list;}

    public void execute(StringDrink drink) {
        for (int i = 0; i < list.size(); i++){
            list.get(i).execute(drink);
        }
    }
}
