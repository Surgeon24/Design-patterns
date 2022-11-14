package m.ermolaev;

public class StringInverter implements StringTransformer {

    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder();
        sb.append(drink.getText());
        sb.reverse();
        drink.setText(sb.toString());
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
