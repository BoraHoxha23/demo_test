import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Survey {
    private String title;
    private String topic;
    private String description;
    private List questions = new ArrayList<>();

    public Survey(String title, String topic, String description) {
        this.title = title;
        this.topic = topic;
        this.description = description;
    }

    public void addQuestion(Questions question) {

        questions.add(question);
    }

    public List<Questions> getQuestions() {

        return questions;
    }

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public String getDescription() {
        return description;
    }
    public void takeSurvey(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Create a survey");
        System.out.print("Enter the title of survey: ");
        title = scanner.nextLine();

        System.out.print("Enter the topic of survey? ");
        topic = scanner.nextLine();

        System.out.print("Enter the description of survey: ");
        description = scanner.nextLine();

    }
    public void alternatives(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Choose the alternative");

        questions= Collections.singletonList(scanner2.nextLine());
    }
}
