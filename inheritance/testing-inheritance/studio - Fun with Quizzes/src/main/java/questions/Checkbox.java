package questions;

public class Checkbox extends Question{

    public Checkbox(String question, Choice[] choiceArray){
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString(){
        String n = "\n";
        return n + "Choose ONE or MORE: " + n + getQuestion() + n + getFormattedChoices();
    }

    public int getNumCorrect(){
        int numCorrect = 0;                 // tracking how many are correct
        for(Choice choice: getChoiceMap().values()){
            if(choice.isCorrect()){
                numCorrect++;
            }
        }
        return numCorrect;
    }

}
