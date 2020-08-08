import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to car rental!");
        boolean answerIsValid = true;
        User user = new User("a", "b");
        Scanner key = new Scanner(System.in);

        while(answerIsValid){
            System.out.println("If you want to log in, type A.");
            System.out.println("If you want to create an account, type B");
            answerIsValid = false;

            String answer = key.nextLine();

            switch(answer){
                case "A": user = App.logIn();
                    break;
                case "B": user = App.signIn();
                    break;
                default:
                    System.out.println("Invalid message, please try again!");
                    answerIsValid = true;
            }
        }

        answerIsValid=true;
        List<Car> cars = null;

        while(answerIsValid){
            answerIsValid=false;
            System.out.println("If you want to sort the cars by year press A");
            System.out.println("If you want to sort the cars by make press B");
            System.out.println("If you want to sort the cars by price from low to high press C");
            System.out.println("If you want to sort the cars by price from high to low press D");
            System.out.println("If you want to sort the cars by engine type press E");

            String answer = key.nextLine();

            switch(answer){
                case "A": cars = App.sortByYear();
                break;
                case "B": cars = App.sortByMake();
                break;
                case "C":
                break;
                case "D":
                break;
                case "E":
                break;
                default:
                    System.out.println("Invalid leter! Please try again.");
                    answerIsValid= true;
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
