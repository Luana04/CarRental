import java.util.ArrayList;
import java.util.List;

public class DataBase {


    public static List<User> getDataBase(){
        List<User> dataBase = new ArrayList<>();

        User user1 = new User("Mihai", "1234"); dataBase.add(user1);
        User user2 = new User("George", "1234"); dataBase.add(user2);
        User user3 = new User("Ana", "1234"); dataBase.add(user3);
        User user4 = new User("Maria", "1234"); dataBase.add(user4);
        User user5 = new User("Andrei", "1234"); dataBase.add(user5);

        return dataBase;
    }

    public static List<Car> getCarList(){
        List<Car> cars = new ArrayList<>();

        Car bmw1_0 = new Car("BMW", "X1","Diesel","Black","SUV", 2.0, true, 4,100, 2018); cars.add(bmw1_0);
        Car bmw1_1 = new Car("BMW","X1","Diesel", "Black", "SUV", 2.8, true,4,120, 2020); cars.add(bmw1_1);
        Car bmw1_2 = new Car("BMW", "X1","Diesel", "Silver", "SUV", 1.8, true, 4,70, 2010); cars.add(bmw1_2);

        Car bmw2_0 = new Car("BMW", "X3","Gasoline", "Black", "SUV", 1.8, false, 4, 80, 2015); cars.add(bmw2_0);
        Car bmw2_1 = new Car("BMW", "X3","Diesel", "Silver", "SUV", 2.4, false, 4, 140, 2020); cars.add(bmw2_1);
        Car bmw2_2 = new Car("BMW", "X3","Diesel", "White", "SUV", 2.0, true, 4, 100, 2018); cars.add(bmw2_2);

        Car bmw3_0 = new Car("BMW", "X5","Diesel", "Pink", "SUV", 4.0, true, 4, 200, 2020); cars.add(bmw3_0);
        Car bmw3_1 = new Car("BMW", "X5","Gasoline", "Black", "SUV", 2.5, true, 4, 120, 2009); cars.add(bmw3_1);
        Car bmw3_2 = new Car("BMW", "X5","Gasoline", "Silver", "SUV", 1.8, true, 4, 70, 2002); cars.add(bmw3_2);
        Car bmw3_3 = new Car("BMW", "X5","Diesel","Black","SUV",2.0,true,4,110, 2015); cars.add(bmw3_3);


        Car dacia1_0 = new Car("Dacia", "Duster","Diesel", "Black", "SUV", 1.5, true,4, 40, 2015); cars.add(dacia1_0);
        Car dacia1_1 = new Car("Dacia", "Duster","Diesel", "Black", "SUV", 1.5, true, 4, 40, 2015); cars.add(dacia1_1);
        Car dacia1_2 = new Car("Dacia", "Duster","Diesel", "Blue", "SUV", 1.7, false,4,50,2015); cars.add(dacia1_2);

        Car dacia2_0 = new Car("Dacia", "Logan", "Gasoline", "White", "Normal", 1.2, true, 4, 30, 2007); cars.add(dacia2_0);
        Car dacia2_1 = new Car("Dacia", "Logan","Gasoline", "Red", "Normal", 1.5, true, 4,40, 2014); cars.add(dacia2_1);
        Car dacia2_2 = new Car("Dacia", "Logan","Diesel", "Black", "Normal", 1.4, true, 4,50, 2017); cars.add(dacia2_2);
        Car dacia2_3 = new Car("Dacia", "Logan","Diesel", "Black", "Normal", 1.6, true, 4,50, 2017); cars.add(dacia2_3);

        return cars;
    }


}
