package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    public static final List<Car> cars;

    static {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Lada", 14));
        cars.add(new Car(2, "BMW", 6));
        cars.add(new Car(3, "Toyota", 130));
        cars.add(new Car(4, "Ford", 500));
        cars.add(new Car(5, "Gas", 4));
    }
}
