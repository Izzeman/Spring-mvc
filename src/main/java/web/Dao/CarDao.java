package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Lotus Elan", 1969, 40000));
        cars.add(new Car("Porsche 550 Spyder Martin", 1970, 35000));
        cars.add(new Car("Chevrolet Impala SS ", 1965, 45000));
        cars.add(new Car("Chevrolet Corvette Stingray", 1973, 27000));
        cars.add(new Car(" Pontiac Firebird Trans-Am", 1973, 55000));

    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCountOfCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
