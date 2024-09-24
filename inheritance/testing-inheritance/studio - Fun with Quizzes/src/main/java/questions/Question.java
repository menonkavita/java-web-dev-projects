package questions;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Question {
    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap<>();                 // choiceMap - HashMap of Integer & Choice
    private int maxResponses = 1;

    public Question(String question, Choice[] choiceArray){
        this.question = question;
        createRandomChoiceMap(choiceArray);
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public String getQuestion() {
        return question;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }

    @Override
    public abstract String toString();

    void createRandomChoiceMap(Choice[] choiceArray){
        ArrayList<Choice> choiceList = new ArrayList<>();

        // Use ArrayList.add("Single Item")
        // Else use Collections.addAll(arraylist, array) to add multiple items like in an array.
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);

        for(int i=0; i< choiceList.size(); i++){        // Adding arraylist to HashMap
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    String getFormattedChoices(){
        StringBuilder formattedChoices =  new StringBuilder();
        String newline = System.lineSeparator();

        // keySet() method of the HashMap class returns a keys (from key-value pair) contained in the map object
        for(int choiceNum : choiceMap.keySet()){
            // choiceMap.get(choiceNum) will return a choice object with matching key.
            // Using Choice class's getter - getContent() to get content
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newline;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

    public boolean isInvalid(String response){
        try{
            int respInt = Integer.parseInt(response);
            return respInt < 1 || respInt > choiceMap.size();
        }
        catch (NumberFormatException e){
            return true;
        }
    }

} // end of class
