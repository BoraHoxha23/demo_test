import java.util.Collections;
import java.util.Scanner;

public class Session1Application {
    public static void main(String[] args) {
        //SpringApplication.run(Session1Application.class, args);y
        Scanner decision = new Scanner(System.in);
        boolean noSelection = true;
        do {
            System.out.println("Do you want to start the survey? Y/N");

            char userChoice = decision.next().charAt(0);

            switch (userChoice) {
                case 'n':
                    System.out.println("You choosed not to start a survey");
                    System.exit(0);
                    break;

                case 'y':
                    noSelection = false;
                    break;

                default:
                    System.out.println("That is not a valid entry");

            }

        }  while (noSelection);

        System.out.println("Starting the survey");

        Survey s1 = new Survey("0", "0", "0 ");
        s1.takeSurvey();
//        Collections Collections = null;
        Questions q1 = new Questions("0", Collections.singletonList("4"));

        q1.makeQuestion();
        //yq1.alternative();

    }
}
