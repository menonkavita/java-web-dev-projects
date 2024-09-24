import questions.*;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args){

        // Create Questions
        String q1 = "Which of the following vegetables is/are fruits?";
        Choice[] q1Choices = new Choice[]{
            new Choice("Potato "),
            new Choice("Tomato", true),
            new Choice("Onion"),
            new Choice("Bell Peppers", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "Who is the first woman astronaut to go on the moon?";
        Choice[] q2Choices = new Choice[]{
                new Choice("Valentina Tereshkova"),
                new Choice("Sally Ride"),
                new Choice("Christina Koch", true),
                new Choice("Sunita Williams")
        };
        Checkbox question2 = new Checkbox(q2, q2Choices);

        String q3 = "Which of the following were written by William Shakespeare? ";
        Choice[] q3Choices = new Choice[]{
                new Choice("Much Ado About Nothing", true),
                new Choice("Rosencrantz and Guildenstern are Dead"),
                new Choice("Paradise Lost"),
                new Choice("Romeo and Juliet", true)
        };
        Checkbox question3 = new Checkbox(q3, q3Choices);

        String q4 = "Which is the biggest water body in the world? ";
        Choice[] q4Choices = new Choice[]{
                new Choice("Southern Ocean"),
                new Choice("Indian Ocean"),
                new Choice("Atlantic Ocean"),
                new Choice("Pacific Ocean", true)
        };
        Checkbox question4 = new Checkbox(q4, q4Choices);

        String q5 = "Are Jalapenos a type of fruit? ";
        Choice[] q5Choices = new Choice[]{
                new Choice("TRUE", true),
                new Choice("FALSE")
        };
        Checkbox question5 = new Checkbox(q5, q5Choices);



        // Add questions to the Quiz
        quiz.addQuestions(new Question[] { question1, question2, question3, question4, question5 });


        // interact with user (Run Quiz, give score)
        quiz.run();

        String n = System.lineSeparator();
        System.out.println(n + "You got " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correct. Hope you enjoyed playing. " + n);
    }

} // end of Class
