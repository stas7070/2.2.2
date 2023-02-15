package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

import static web.dao.CarDaoImpl.cars;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private final CarDaoImpl carDao = new CarDaoImpl();
    @Override
    public List<Car> countCars(int count) {
        if (count == 0 || count > 5) {
            return carDao.getCars();
        }
        return carDao.getCars().stream().limit(count).collect(Collectors.toList());
    }


}
