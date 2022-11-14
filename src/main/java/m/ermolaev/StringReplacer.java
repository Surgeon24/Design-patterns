package m.ermolaev;

public class StringReplacer implements StringTransformer {
    char from;
    char to;

    public StringReplacer(char from, char to){
        this.from = from;
        this.to = to;
    }
    public void execute(StringDrink drink) {
        String str = drink.getText();
        str = str.replace(from, to);
        drink.setText(str);
    }

    public void undo(StringDrink drink){
        char tmp = from;
        from = to;
        to = tmp;
        execute(drink);
    }
}
