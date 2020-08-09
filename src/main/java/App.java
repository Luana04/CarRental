import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static User signIn(){
        Scanner key = new Scanner(System.in);
        List<User> dataBase = DataBase.getDataBase();
        boolean usernameIsValid = true;
        System.out.println("Choose an username!");
        String username = key.nextLine();

        while(usernameIsValid){
            usernameIsValid = false;

            for (User user : dataBase) {
                User userTest = new User("a","b");
                userTest = user;
                if (username.equals(userTest.username)) {
                    System.out.println("This username is already taken! Try a new one");
                    username = key.nextLine();
                    usernameIsValid = true;
                }
            } }

        System.out.println("Now choose a password!");

        String password = key.nextLine();

        return new User(username, password);
    }

    public static User logIn(){
        List<User> dataBase = DataBase.getDataBase();
        Scanner key = new Scanner(System.in);
        String username;
        boolean usernameIsExistent = true;
        boolean usernameIsExistent2 = false;
        User user = new User("a", "b");
        while(usernameIsExistent){
            usernameIsExistent = false;
            System.out.println("Insert username");
            username = key.nextLine();
            for (User userTest : dataBase) {
                if (username.equalsIgnoreCase(userTest.username)) {
                    usernameIsExistent2 = true;
                    for (int j = 0; j < 4; j++) {
                        System.out.println("Insert your password!");
                        String password = key.nextLine();
                        if (password.equals(userTest.password)) {
                            user = userTest;
                            j = 4;
                        } else {
                            System.out.println("Wrong password!");
                            if (j == 3) {
                                System.out.println("No more tries. Sign in to create another account.");
                                signIn();
                            } else
                                System.out.println("Try again!");
                        }
                    }
                }
            }

            if(!usernameIsExistent2){
                System.out.println("Username not found!");
                user = signIn();
                break;
            }
        }
        return user;
    }

    public static List<Car> sortByYear(){
        List<Car> cars = DataBase.getCarList();
        for (int i = 0; i < cars.size()-1; i++) {
            for (int j = 0; j < cars.size()-i-1; j++) {
                Car carTest1 = cars.get(j);
                Car carTest2 = cars.get(j+1);
                if(carTest1.getYear()<carTest2.getYear()){
                    int a = carTest1.getYear();
                    carTest1.setYear(carTest2.getYear());
                    carTest2.setYear(a);
                }
            }
        }

        return cars;
    }

    public static List<Car> sortByMake(){
        List<Car> cars = DataBase.getCarList();
        List<Car> cars1 = new ArrayList<>();
        Scanner key = new Scanner(System.in);
        boolean wantToFind = true;

        while(wantToFind){
            System.out.println("What make are you trying to find?");
            wantToFind = false;
            String make = key.nextLine();
            int nrOfCars = 0;
            for (Car car : cars) {
                if (make.equalsIgnoreCase(car.getMake())) {
                    cars1.add(car);
                    ++nrOfCars;
                }
            }

            if (nrOfCars==0){
                System.out.println("Make not found! Try searching for a new one.");
                wantToFind=true;
            }

        }
        return cars1;
    }

    public static List<Car> sortByPriceLH() {
        List<Car> cars = DataBase.getCarList();
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                Car carTest1 = cars.get(j);
                Car carTest2 = cars.get(j + 1);
                if (carTest1.getPrice() > carTest2.getPrice()) {
                    int a = carTest1.getPrice();
                    carTest1.setPrice(carTest2.getPrice());
                    carTest2.setPrice(a);
                }
            }
        }

        return cars;
    }

    public static List<Car> sortByPriceHL() {
        List<Car> cars = DataBase.getCarList();
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                Car carTest1 = cars.get(j);
                Car carTest2 = cars.get(j + 1);
                if (carTest1.getPrice() < carTest2.getPrice()) {
                    int a = carTest1.getPrice();
                    carTest1.setPrice(carTest2.getPrice());
                    carTest2.setPrice(a);
                }
            }
        }

        return cars;
    }

    public static List<Car> sortByEngine(){
        List<Car> cars = DataBase.getCarList();
        List<Car> cars1 = new ArrayList<>();
        Scanner key = new Scanner(System.in);
        boolean wantToFind = true;

        while(wantToFind){
            System.out.println("What engine type are you trying to find?");
            wantToFind = false;
            double engine = key.nextDouble();
            int nrOfCars = 0;
            for (Car car : cars) {
                if (engine == car.getEngine()) {
                    cars1.add(car);
                    ++nrOfCars;
                }
            }

            if (nrOfCars==0){
                System.out.println("Engine not found! Try searching for a new one.");
                wantToFind=true;
            }

        }
        return cars1;
    }

    public static void rentCar(){
        List<Car> cars = DataBase.getCarList();
        Scanner key = new Scanner(System.in);

        int nrOfCars = 0;
        boolean a = true;

        while(a){
            a = false;

            System.out.println("What's the make of the car you want to rent?");
            String make = key.nextLine();
            System.out.println("What's the year of the car you want to rent?");
            int year = key.nextInt();
            System.out.println("What's the engine of the car you want to rent?");
            double engine = key.nextDouble();

            for (Car car : cars) {
                if (make.equalsIgnoreCase(car.getMake()) && year == car.getYear() && engine == car.getEngine()) {
                    nrOfCars = 1;
                    System.out.println("This is the car you want to rent.");
                    System.out.println(car);
                    System.out.println("Your total is " + car.getPrice() + " $.");
                    System.out.println("You'll soon receive an email from us for more information about the rental process.");
                    System.out.println("Thank you for using car rental!");
                    break;
                }
            }

            if (nrOfCars==0){
                System.out.println("Car not found! Please try a new one.");
                a = true;
            }
        }
    }
}
