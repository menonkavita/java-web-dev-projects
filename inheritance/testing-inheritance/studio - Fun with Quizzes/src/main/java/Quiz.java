import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import questions.Choice;
import questions.Question;


public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect(){
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray){
        Collections.addAll(questions, questionArray);
    }

    public void run(){
        Scanner input  = new Scanner(System.in);
        Collections.shuffle(questions);

        for(Question q : questions){
            // Prints the question for user
            System.out.println(q);

            // Get & check responses
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;

            while(i < q.getMaxResponses()){
                String userResponse;

                // Validate
                do{
                    System.out.println("Please enter a number: ");
                    userResponse = input.nextLine();
                }while(q.isInvalid(userResponse));

                // Evaluate the response
                int userResponseNum = Integer.parseInt(userResponse);
                if(userResponses.contains(userResponseNum)){
                    System.out.println("You already got that one! ");
                }
                else if(!q.getChoiceMap().get(userResponseNum).isCorrect()){
                    System.out.println("The correct answer is: ");
                    for(Choice ch: q.getChoiceMap().values()){
                        if(ch.isCorrect()){
                            System.out.println(ch.getContent());
                        }
                    }
                    break;
                }
                else{
                    System.out.println("Correct! ");
                    userResponses.add(userResponseNum);

                    if(i == q.getMaxResponses() -1){
                        numCorrect++;
                    }
                    i++;
                }
            }
        }
        input.close();
    }

} // end of Class
