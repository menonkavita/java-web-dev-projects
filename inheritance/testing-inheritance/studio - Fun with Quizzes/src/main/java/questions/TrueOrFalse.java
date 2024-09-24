package questions;

public class TrueOrFalse extends Question{

    public TrueOrFalse(String question, Choice[] choiceArray){
        super(question, choiceArray);
    }

    @Override
    public String toString(){
        String n = "\n";
        return n + "TRUE OR FALSE: " + n + getQuestion() + n + getFormattedChoices();
    }

}
