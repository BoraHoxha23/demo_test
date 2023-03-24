//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import java.util.*;
public class Questions {
    private String question;
    private List<String> alternatives = new ArrayList<>();  //vektori i tipit String

    public Questions(String question, List<String> alternatives) {
        this.question = question;
        this.alternatives = alternatives;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAlternatives() {
        return alternatives;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAlternatives(List<String> alternatives) {
        this.alternatives = alternatives;
    }

    public void makeQuestion(){
        Scanner scanner = new Scanner(System.in);
        int candidates;
        String[] questions;
        String[][] responses;

        int choice;
        int agree=1;
        int slighltyAgree=2;
        int slighlyyDisagree=3;
        int disagree=4;

        // Get number of participants and questions
        System.out.print("Enter number of candidates: ");
        candidates = scanner.nextInt();
        scanner.nextLine(); // clear input buffer
        System.out.print("Enter number of questions: ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // clear input buffer
        // Initialize questions and responses arrays
        questions = new String[numQuestions];
        responses = new String[candidates][numQuestions];

        // Get questions
        for (int i = 0; i <= 2; i++) {
            String question;
            boolean isUnique = false;
            do {
                System.out.print("Enter question " + (i+1) + ": ");
                question = scanner.nextLine();
                // Check if question is unique
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (questions[j].equals(question)) {
                        System.out.println("Question must be unique. Please enter a different question.");
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            questions[i] = question;

        }

        // Get responses for each participant
        for (int i = 0; i < candidates; i++) {
            System.out.println("Candidate " + (i+1) + ":");
            for (int j = 0; j < numQuestions; j++) {
                // Scanner sc = new Scanner(System.in);

                //System.out.println("Choose one alternative");
                System.out.println("1.agree");
                System.out.println("2.slightlyAgree");
                System.out.println("3.slightlyDisagree");
                System.out.println("4.disagree");

                choice=scanner.nextInt();
                if(choice==1){
                    choice=agree;
                } else if (choice==2) {
                    choice=slighltyAgree;
                } else if (choice==3) {
                    choice=slighlyyDisagree;
                }else if (choice==4){
                    choice=disagree;
                } else if (choice >4 || choice <1) {
                    System.out.println("Try again");
                    choice = -1;

                    //alternative();
                }
                System.out.print("  " + questions[j] + ": ");
                responses[i][j] = scanner.nextLine();
            }
        }

        // Print survey results
        System.out.println("Survey Results:");
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Question " + (i+1) + ": " + questions[i]);
            for (int j = 0; j < candidates; j++) {
                System.out.println("  Candidate " + (j+1) + ": " + responses[j][i]);
            }
        }
}
}