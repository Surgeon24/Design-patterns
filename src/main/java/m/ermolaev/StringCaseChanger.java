package m.ermolaev;

public class StringCaseChanger implements StringTransformer {

    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder();
        sb.append(drink.getText());
        for (int i = 0; i < sb.length(); i++){
            if (Character.isLowerCase(sb.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
            else{
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            }
        }
        drink.setText(sb.toString());
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
